package top.sehnsucht.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    //返回码
    private Integer code;
    //返回描述
    private String message;
    //返回数据
    private T data;
    //分页查询总记录
    private Long count;

    public static Result<Object> success() {
        return new Result(1, "success", null, null);
    }

    public static Result<Object> success(Object data, Long count) {
        return new Result(1, "success", data, count);
    }

    public static Result<Object> fail() {
        return new Result(0, "fail", null, null);
    }

    public static Result<Object> fail(String message) {
        return new Result(0, message, null, null);
    }


}
