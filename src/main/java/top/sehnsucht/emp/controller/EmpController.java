package top.sehnsucht.emp.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @DeleteMapping("/{ids}")
    @ResponseBody
    @ApiOperation("删除接口")
    public Result<Object> deleteEmpByIds(@PathVariable("ids") String ids) {
        empService.deleteEmpByIds(ids);
        return Result.success("删除员工成功");
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "编辑接口", tags = "返回单个Emp")
    public String getEmpById(@PathVariable("id") Integer id, Model model) {
        Emp emp = empService.getEmpById(id);
        model.addAttribute("emp", emp);
        model.addAttribute("deptList",empService.getAllDept());
        return "emp/empEdit";
    }

    @PutMapping("")
    @ResponseBody
    @ApiOperation("修改接口")
    public Result<Object> updateEmp(Emp emp) {
        empService.updateEmp(emp);
        return Result.success("员工信息修改成功!");
    }


}
