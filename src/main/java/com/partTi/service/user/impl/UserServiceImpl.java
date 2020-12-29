package com.partTi.service.user.impl;

import com.partTi.dao.user.UserDao;
import com.partTi.pojo.user.User;
import com.partTi.service.user.UserService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public ResponseDate getUserByAny(User user, Integer index, Integer pageSize) {
        List<User> users = userDao.getUserByAny(user,index,pageSize);
        if (users != null){
            return new ResponseDate(200,"用户信息查询成功",users);
        }else {
            return new ResponseDate(444,"查询用户信息失败");
        }
    }

    @Override
    public ResponseDate getUserById(Integer id) {
        User user = userDao.getUserById(id);
        if (user != null){
            return new ResponseDate(200,"用户信息查询成功",user);
        }else {
            return new ResponseDate(444,"查询用户信息失败");
        }
    }

    @Override
    public ResponseDate getUserByUsername(String username) {
        User user = userDao.getUserByUsername(username);
        if (user != null){
            return new ResponseDate(200,"用户信息查询成功",user);
        }else {
            return new ResponseDate(444,"查询用户信息失败");
        }
    }

    @Override
    public ResponseDate saveUser(User user) {
        int status = userDao.saveUser(user);
        if (status <= 0){
            return new ResponseDate(444,"添加用户失败",status);
        }else {
            return new ResponseDate(200,"添加用户成功",user);
        }
    }

    @Override
    public ResponseDate updateUser(User user) {
        int status = userDao.updateUser(user);
        if (status <= 0){
            return new ResponseDate(444,"更新用户失败",status);
        }else {
            return new ResponseDate(200,"更新用户成功",user);
        }
    }

    @Override
    public ResponseDate deleteUser(Integer id) {
        int status = userDao.deleteUser(id);
        if (status <= 0){
            return new ResponseDate(444,"删除用户失败",status);
        }else {
            return new ResponseDate(200,"删除用户成功",id);
        }
    }

    @Override
    public ResponseDate countUser(User user, Integer index, Integer pageSize) {
        int result = userDao.countUser(user,index,pageSize);
        if (result < 0){
            return new ResponseDate(444,"统计数量失败",result);
        }else {
            return new ResponseDate(200,"统计数量成功",result);
        }
    }
}
