package top.sehnsucht.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/12
 * ~~(^_^)~~
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page implements Serializable {
    private Integer page;
    private Integer limit;

    public Long getStart() {
        return Long.valueOf((page - 1) * limit);
    }
}



