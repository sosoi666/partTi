package com.partTi.service.user.impl;

import com.partTi.dao.user.AdminUserDao;
import com.partTi.pojo.user.AdminUser;
import com.partTi.service.user.AdminUserService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserDao adminUserDao;

    @Override
    public ResponseDate getAdminUserById(Integer id) {
        AdminUser adminUser = adminUserDao.getAdminUserById(id);
        if (adminUser != null){
            return new ResponseDate(200,"管理员用户查询成功",adminUser);
        }else {
            return new ResponseDate(444,"查询管理员用户失败");
        }
    }

    @Override
    public ResponseDate saveAdminUser(AdminUser adminUser) {
        int status =adminUserDao.saveAdminUser(adminUser);
        if(status <= 0){
            return new ResponseDate(444,"添加管理员用户失败",status);
        }else {
            return new ResponseDate(200,"添加管理员用户成功",adminUser);
        }
    }

    @Override
    public ResponseDate updateAdminUser(AdminUser adminUser) {
        int status =adminUserDao.updateAdminUser(adminUser);
        if(status <= 0){
            return new ResponseDate(444,"更新管理员用户失败",status);
        }else {
            return new ResponseDate(200,"更新管理员用户成功",adminUser);
        }
    }

    @Override
    public ResponseDate deleteAdminUser(Integer id) {
        int status =adminUserDao.deleteAdminUser(id);
        if(status <= 0){
            return new ResponseDate(444,"删除管理员用户失败",status);
        }else {
            return new ResponseDate(200,"删除管理员用户成功",id);
        }
    }
}
