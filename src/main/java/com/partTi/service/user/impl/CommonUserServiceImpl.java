package com.partTi.service.user.impl;

import com.partTi.dao.user.CommonUserDao;
import com.partTi.pojo.user.CommonUser;
import com.partTi.service.user.CommonUserService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonUserServiceImpl implements CommonUserService {

    @Autowired
    private CommonUserDao commonUserDao;

    @Override
    public ResponseDate getCommonUserById(Integer id) {
        CommonUser commonUser = commonUserDao.getCommonUserById(id);
        if (commonUser != null){
            return new ResponseDate(200,"普通用户查询成功",commonUser);
        }else {
            return new ResponseDate(444,"查询普通用户失败");
        }
    }

    @Override
    public ResponseDate saveCommonUser(CommonUser commonUser) {
        int status =commonUserDao.saveCommonUser(commonUser);
        if(status <= 0){
            return new ResponseDate(444,"添加普通用户失败",status);
        }else {
            return new ResponseDate(200,"添加普通用户成功",commonUser);
        }
    }

    @Override
    public ResponseDate updateCommonUser(CommonUser commonUser) {
        int status =commonUserDao.updateCommonUser(commonUser);
        if(status <= 0){
            return new ResponseDate(444,"更新普通用户失败",status);
        }else {
            return new ResponseDate(200,"更新普通用户成功",commonUser);
        }
    }

    @Override
    public ResponseDate deleteCommonUser(Integer id) {
        int status =commonUserDao.deleteCommonUser(id);
        if(status <= 0){
            return new ResponseDate(444,"删除普通用户失败",status);
        }else {
            return new ResponseDate(200,"删除普通用户成功",id);
        }
    }
}
