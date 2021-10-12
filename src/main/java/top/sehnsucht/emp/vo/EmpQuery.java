package top.sehnsucht.emp.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import top.sehnsucht.common.vo.Page;

import java.util.Date;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/12
 * ~~(^_^)~~
 */

@Data
public class EmpQuery extends Page {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
}
