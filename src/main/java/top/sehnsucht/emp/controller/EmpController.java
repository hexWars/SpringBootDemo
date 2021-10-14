package top.sehnsucht.emp.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
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
@Api(tags = "员工控制器")
@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("")
    @ApiOperation("列表页面")
    public String toEmpListUI(){
        return "emp/empList";
    }

    @GetMapping("/list")
    @ResponseBody
    @ApiOperation("列表接口")
    public Result<Object> getEmpList(EmpQuery param) {
        List<Emp> list = empService.getEmplist(param);
        Long count = empService.countEmpList(param);
        return Result.success(list,count);
    }

    @PostMapping("/add")
    @ResponseBody
    @ApiOperation("添加接口")
    public Result<Object> addEmp(Emp emp) {
        empService.addEmp(emp);
        return Result.success("新增员工成功");
    }

    @GetMapping("/add/ui")
    @ApiOperation("添加界面")
    public String toAddUI(Model model) {
        List<Dept> deptList = empService.getAllDept();
        model.addAttribute("deptList",deptList);
        return "emp/empAdd";
    }


}
