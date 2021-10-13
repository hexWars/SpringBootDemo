package top.sehnsucht.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.sehnsucht.common.vo.Result;
import top.sehnsucht.emp.entity.Dept;
import top.sehnsucht.emp.entity.Emp;
import top.sehnsucht.emp.service.EmpService;
import top.sehnsucht.emp.vo.EmpQuery;

import java.util.List;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("")
    public String toEmpListUI(){
        return "emp/empList";
    }

    @GetMapping("/list")
    @ResponseBody
    public Result<Object> getEmpList(EmpQuery param) {
        List<Emp> list = empService.getEmplist(param);
        Long count = empService.countEmpList(param);
        return Result.success(list,count);
    }

    @PostMapping("/add")
    @ResponseBody
    public Result<Object> addEmp(Emp emp) {
        empService.addEmp(emp);
        return Result.success("新增员工成功");
    }

    @GetMapping("/add/ui")
    public String toAddUI(Model model) {
        List<Dept> deptList = empService.getAllDept();
        model.addAttribute("deptList",deptList);
        return "emp/empAdd";
    }


}
