package com.partTi.service.user.impl;

import com.partTi.dao.user.CompanyUserDao;
import com.partTi.pojo.user.CompanyUser;
import com.partTi.service.user.CompanyUserService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyUserServiceImpl implements CompanyUserService {

    @Autowired
    private CompanyUserDao companyUserDao;

    @Override
    public ResponseDate getCompanyUserById(Integer id) {
        CompanyUser companyUser = companyUserDao.getCompanyUserById(id);
        if (companyUser != null){
            return new ResponseDate(200,"公司查询成功",companyUser);
        }else {
            return new ResponseDate(444,"查询公司失败");
        }
    }

    @Override
    public ResponseDate saveCompanyUser(CompanyUser companyUser) {
        int status =companyUserDao.saveCompanyUser(companyUser);
        if(status <= 0){
            return new ResponseDate(444,"添加公司失败",status);
        }else {
            return new ResponseDate(200,"添加公司成功",companyUser);
        }
    }

    @Override
    public ResponseDate updateCompanyUser(CompanyUser companyUser) {
        int status =companyUserDao.updateCompanyUser(companyUser);
        if(status <= 0){
            return new ResponseDate(444,"更新公司信息失败",status);
        }else {
            return new ResponseDate(200,"更新公司信息成功",companyUser);
        }
    }

    @Override
    public ResponseDate deleteCompanyUser(Integer id) {
        int status =companyUserDao.deleteCompanyUser(id);
        if(status <= 0){
            return new ResponseDate(444,"删除公司失败",status);
        }else {
            return new ResponseDate(200,"删除公司成功",id);
        }
    }
}
