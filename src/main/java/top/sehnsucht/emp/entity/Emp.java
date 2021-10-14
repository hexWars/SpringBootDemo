package top.sehnsucht.emp.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */

@ApiModel("Emp 员工实体类")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable {
    private Integer empId;
    private String name;
    private String sex;
    private Integer age;
    private Double sal;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String address;
    private Integer deptId;

    private Dept dept;
}
