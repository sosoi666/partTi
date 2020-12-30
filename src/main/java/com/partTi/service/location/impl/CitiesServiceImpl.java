package com.partTi.service.location.impl;

import com.partTi.dao.location.CitiesDao;
import com.partTi.pojo.location.Cities;
import com.partTi.service.location.CitiesService;
import com.partTi.utils.ResponseDate;
import com.sun.javafx.logging.JFRInputEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesServiceImpl implements CitiesService {

    @Autowired
    private CitiesDao citiesDao;

    @Override
    public ResponseDate getCitiesByProvinceId(Integer id) {
        List<Cities> cities = citiesDao.getCitiesByProvinceId(id);
        if (cities != null){
            return new ResponseDate(200,"查询城市成功",cities);
        }else {
            return new ResponseDate(444,"查询城市失败");
        }
    }

    @Override
    public ResponseDate getCityById(Integer id) {
        Cities cities = citiesDao.getCityById(id);
        if (cities != null){
            return new ResponseDate(200,"查询城市成功",cities);
        }else {
            return new ResponseDate(444,"查询城市失败");
        }
    }
}
