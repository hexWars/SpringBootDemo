package top.sehnsucht.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.sehnsucht.common.vo.Result;
import top.sehnsucht.user.entity.User;
import top.sehnsucht.user.service.UserService;

import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */

@RestController
@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(User param, HttpSession session) {
        User user = userService.login(param);
        if ( user != null) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            //参数1请求密码,参数2是加密后的值
            boolean matches = passwordEncoder.matches(param.getPassword(), user.getPassword());
            if (matches) {
                user.setPassword(null);
                session.setAttribute("userInfo",user);
                return Result.success();
            }
        }
        return Result.fail("用户名或密码错误");
    }



}
