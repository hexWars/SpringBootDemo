package top.sehnsucht.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.sehnsucht.common.vo.Result;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/14
 * ~~(^_^)~~
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result<Object> myHandler(Exception e) {
        return Result.fail("系统错误: " + e.getMessage());
    }

}
