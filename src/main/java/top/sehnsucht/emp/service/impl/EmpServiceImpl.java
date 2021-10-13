package top.sehnsucht.emp.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.sehnsucht.emp.entity.Dept;
import top.sehnsucht.emp.entity.Emp;
import top.sehnsucht.emp.mapper.DeptMapper;
import top.sehnsucht.emp.mapper.EmpMapper;
import top.sehnsucht.emp.service.EmpService;
import top.sehnsucht.emp.vo.EmpQuery;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/12
 * ~~(^_^)~~
 */
@Service
@Slf4j
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;
    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Emp> getEmplist(EmpQuery param) {
        log.debug("进入查询");
        return empMapper.getEmpList(param);
    }

    @Override
    public Long countEmpList(EmpQuery param) {
        return empMapper.countEmpList(param);
    }

    @Override
    public void addEmp(Emp emp) {
        empMapper.addEmp(emp);
    }

    @Override
    public List<Dept> getAllDept() {
        return deptMapper.getAllDept();
    }
}
