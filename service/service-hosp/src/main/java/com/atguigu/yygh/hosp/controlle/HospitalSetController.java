package com.atguigu.yygh.hosp.controlle;

import com.atguigu.yygh.hosp.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : 余欣文
 * @mingcheng : 医院模块Controller
 * @date :2022/5/18 22:21
 */
@Api(tags = "医院接口")
@RequestMapping("/admin/hosp/hospitalSet")
@RestController
public class HospitalSetController {
    @Resource
    HospitalSetService hospitalSetService;

    @ApiOperation(value = "获取所有医院设置")
    @GetMapping("findAll")
    public Object findAllHospitalSet() {
        //调用service的方法
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }


}
