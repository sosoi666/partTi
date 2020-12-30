package com.partTi.service.location.impl;

import com.partTi.dao.location.ProvincesDao;
import com.partTi.pojo.location.Provinces;
import com.partTi.service.location.ProvinceService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvincesDao provincesDao;

    @Override
    public ResponseDate getAllProvinces() {
        List<Provinces> provinces = provincesDao.getAllProvinces();
        if (provinces != null){
            return new ResponseDate(200,"查询省份成功",provinces);
        }else {
            return new ResponseDate(444,"查询省份失败");
        }
    }

    @Override
    public ResponseDate getProvincesById(Integer id) {
        Provinces provinces = provincesDao.getProvincesById(id);
        if (provinces != null){
            return new ResponseDate(200,"查询省份成功",provinces);
        }else {
            return new ResponseDate(444,"查询省份失败");
        }
    }
}
