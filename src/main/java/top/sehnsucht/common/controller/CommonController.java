package top.sehnsucht.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */

@Controller
public class CommonController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "spring boot ";
    }
}
