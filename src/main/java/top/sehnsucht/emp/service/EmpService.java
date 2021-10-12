package top.sehnsucht.emp.service;

import top.sehnsucht.emp.entity.Emp;
import top.sehnsucht.emp.vo.EmpQuery;

import java.util.List;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/12
 * ~~(^_^)~~
 */

public interface EmpService {
    public List<Emp> getEmplist(EmpQuery param);

    public Long countEmpList(EmpQuery param);
}
