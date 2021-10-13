package top.sehnsucht.emp.mapper;

import top.sehnsucht.emp.entity.Emp;
import top.sehnsucht.emp.vo.EmpQuery;

import java.util.List;

public interface EmpMapper {
    List<Emp> getEmpList(EmpQuery param);

    Long countEmpList(EmpQuery param);

    void addEmp(Emp emp);
}
