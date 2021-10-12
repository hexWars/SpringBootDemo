package top.sehnsucht.emp.vo;

import lombok.Data;
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
    private Date startDate;
    private Date endDate;
}
