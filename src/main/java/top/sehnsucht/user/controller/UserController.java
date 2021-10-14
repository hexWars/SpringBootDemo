package top.sehnsucht.user.controller;

import com.ramostear.captcha.HappyCaptcha;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import top.sehnsucht.common.vo.Result;
import top.sehnsucht.user.entity.User;
import top.sehnsucht.user.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */
@Api(tags = "用户控制器")
@RestController
@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ApiOperation("登录接口")
    public Object login( User param, @RequestParam("captcha") String captcha, HttpSession session, HttpServletRequest request) {

        User user = userService.login(param);
        if ( user != null) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            //参数1请求密码,参数2是加密后的值
            boolean matches = passwordEncoder.matches(param.getPassword(), user.getPassword());
            System.out.println("验证密码中...");
            if (matches) {
                System.out.println("密码正确,准备验证");
                boolean flag = HappyCaptcha.verification(request,captcha,true);
                if(flag){
                    HappyCaptcha.remove(request);
                    user.setPassword(null);
                    session.setAttribute("userInfo",user);
                    return Result.success();
                } else {
                    return Result.fail("验证码错误");
                }
            }
        }
        return Result.fail("用户名或密码错误");
    }
}
