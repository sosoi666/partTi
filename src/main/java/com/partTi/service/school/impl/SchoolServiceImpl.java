package com.partTi.service.school.impl;

import com.partTi.dao.school.SchoolDao;
import com.partTi.pojo.school.School;
import com.partTi.service.school.SchoolService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolDao schoolDao;

    @Override
    public ResponseDate getAllSchool() {
        List<School> schools = schoolDao.getAllSchool();
        if (schools != null){
            return new ResponseDate(200,"查询学校成功",schools);
        }else {
            return new ResponseDate(444,"查询学校失败");
        }
    }

    @Override
    public ResponseDate getSchoolById(Integer id) {
        School school = schoolDao.getSchoolById(id);
        if (school != null){
            return new ResponseDate(200,"查询学校成功",school);
        }else {
            return new ResponseDate(444,"查询学校失败");
        }
    }

    @Override
    public ResponseDate insertSchool(School school) {
        int status = schoolDao.insertSchool(school);
        if (status <= 0){
            return new ResponseDate(444,"添加学校失败",status);
        }else {
            return new ResponseDate(200,"添加学校成功",school);
        }
    }

    @Override
    public ResponseDate updateSchool(School school) {
        int status = schoolDao.updateSchool(school);
        if (status <= 0){
            return new ResponseDate(444,"更新学校失败",status);
        }else {
            return new ResponseDate(200,"添加学校失败",school);
        }
    }

    @Override
    public ResponseDate deleteSchool(Integer id) {
        int status = schoolDao.deleteSchool(id);
        if (status <= 0){
            return new ResponseDate(444,"删除学校失败",status);
        }else {
            return new ResponseDate(200,"删除学校成功",id);
        }
    }
}
