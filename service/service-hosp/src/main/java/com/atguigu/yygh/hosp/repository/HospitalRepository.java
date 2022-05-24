package com.atguigu.yygh.hosp.repository;

import com.atguigu.yygh.model.hosp.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 余欣文
 */
@Repository
public interface HospitalRepository extends MongoRepository<Hospital,String> {
    /**
     * 判断是否存在数据
     * @param hoscode
     * @return
     */
    Hospital getHospitalByHoscode(String hoscode);

    /**
     * 根据医院名称查询
     * @param hosname
     * @return
     */
    List<Hospital> findHospitalByHosnameLike(String hosname);
}
