package com.partTi.service.user.impl;

import com.partTi.dao.user.RoleDao;
import com.partTi.pojo.user.Role;
import com.partTi.service.user.RoleService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public ResponseDate getRoleById(Integer id) {
        Role role = roleDao.getRoleById(id);
        if (role != null){
            return new ResponseDate(200,"权限信息查询成功",role);
        }else {
            return new ResponseDate(444,"查询权限信息失败");
        }
    }

    @Override
    public ResponseDate getAllRole() {
        List<Role> role = roleDao.getAllRole();
        if (role != null){
            return new ResponseDate(200,"权限信息查询成功",role);
        }else {
            return new ResponseDate(444,"查询权限信息失败");
        }
    }

    @Override
    public ResponseDate saveRole(Role role) {
        int status = roleDao.saveRole(role);
        if(status <= 0){
            return new ResponseDate(444,"添加权限信息失败",status);
        }else {
            return new ResponseDate(200,"添加权限信息成功",role);
        }
    }

    @Override
    public ResponseDate updateRole(Role role) {
        int status = roleDao.updateRole(role);
        if(status <= 0){
            return new ResponseDate(444,"更新权限信息失败",status);
        }else {
            return new ResponseDate(200,"更新权限信息成功",role);
        }
    }

    @Override
    public ResponseDate deleteRole(Integer id) {
        int status = roleDao.deleteRole(id);
        if(status <= 0){
            return new ResponseDate(444,"删除权限信息失败",status);
        }else {
            return new ResponseDate(200,"删除权限信息成功",id);
        }
    }
}
