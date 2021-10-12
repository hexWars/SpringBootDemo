package top.sehnsucht.emp.service.impl;

import org.springframework.stereotype.Service;
import top.sehnsucht.emp.entity.Emp;
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
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;

    @Override
    public List<Emp> getEmplist(EmpQuery param) {
        System.out.println(param.getName() + ' ' + param.getStartDate() + ' ' + param.getEndDate());
        return empMapper.getEmpList(param);
    }

    @Override
    public Long countEmpList(EmpQuery param) {
        return empMapper.countEmpList(param);
    }
}
