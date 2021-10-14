package top.sehnsucht.common.exception;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/14
 * ~~(^_^)~~
 */

@Controller
@Api("异常控制器")
public class NotFoundController implements ErrorController {

    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    @ApiOperation("404跳转")
    public String error404() {
        return "error/404";
    }
}
