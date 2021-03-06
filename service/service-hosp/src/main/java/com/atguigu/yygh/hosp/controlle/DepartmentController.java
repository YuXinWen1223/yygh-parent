package com.atguigu.yygh.hosp.controlle;

import com.atguigu.yygh.common.result.Result;
import com.atguigu.yygh.hosp.service.DepartmentService;
import com.atguigu.yygh.vo.hosp.DepartmentVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 余欣文
 */
@RestController
@RequestMapping("/admin/hosp/department")
@CrossOrigin
@Api(tags = "医院详情单查")
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    /**
     * 根据医院编号，查询医院所有科室列表
     *
     * @param hoscode
     * @return
     */
    @ApiOperation(value = "查询医院所有科室列表")
    @GetMapping("getDeptList/{hoscode}")
    public Result getDeptList(@PathVariable String hoscode) {
        List<DepartmentVo> list = departmentService.findDeptTree(hoscode);
        return Result.ok(list);
    }
}
