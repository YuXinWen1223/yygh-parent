package com.atguigu.yygh.hosp.service;

import com.atguigu.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author : 余欣文
 * @mingcheng : yygh-parent
 * @date :2022/5/18 22:05
 */
public interface HospitalSetService extends IService<HospitalSet> {
    String getSignKey(String hoscode);
}
