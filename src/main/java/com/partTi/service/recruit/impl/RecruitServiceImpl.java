package com.partTi.service.recruit.impl;

import com.partTi.dao.recruit.RecruitDao;
import com.partTi.pojo.recruit.Recruit;
import com.partTi.service.recruit.RecruitService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitServiceImpl implements RecruitService {

    @Autowired
    private RecruitDao recruitDao;

    @Override
    public ResponseDate getIndentDetailByAny(Recruit recruit, Integer index, Integer pageSize, String sort) {
        List<Recruit> recruits = recruitDao.getIndentDetailByAny(recruit,index,pageSize,sort);
        if (recruits != null){
            return new ResponseDate(200,"查询招聘信息成功",recruits);
        }else {
            return new ResponseDate(444,"查询招聘信息失败");
        }
    }

    @Override
    public ResponseDate countRecruit(Recruit recruit, String sort) {
        int result = recruitDao.countRecruit(recruit,sort);
        if (result < 0){
            return new ResponseDate(444,"统计招聘信息数量失败",result);
        }else {
            return new ResponseDate(200,"统计招聘信息成功",result);
        }
    }

    @Override
    public ResponseDate getRecruitById(String id) {
        Recruit recruit = recruitDao.getRecruitById(id);
        if (recruit != null){
            return new ResponseDate(200,"查询招聘信息成功",recruit);
        }else {
            return new ResponseDate(444,"查询招聘信息失败");
        }
    }

    @Override
    public ResponseDate insertRecruit(Recruit recruit) {
        int status = recruitDao.insertRecruit(recruit);
        if (status <= 0){
            return new ResponseDate(444,"添加招聘信息失败",status);
        }else {
            return new ResponseDate(200,"添加招聘信息成功",recruit);
        }
    }

    @Override
    public ResponseDate updateRecruit(Recruit recruit) {
        int status = recruitDao.updateRecruit(recruit);
        if (status <= 0){
            return new ResponseDate(444,"更新招聘信息失败",status);
        }else {
            return new ResponseDate(200,"更新招聘信息成功",recruit);
        }
    }

    @Override
    public ResponseDate deleteRecruitById(String id) {
        int status = recruitDao.deleteRecruitById(id);
        if (status <= 0){
            return new ResponseDate(444,"删除招聘信息失败",status);
        }else {
            return new ResponseDate(200,"删除招聘信息成功",id);
        }
    }

    @Override
    public ResponseDate setRecruitTrue(String id) {
        int status = recruitDao.setRecruitTrue(id);
        if (status <= 0){
            return new ResponseDate(444,"更新招聘信息失败",status);
        }else {
            return new ResponseDate(200,"更新招聘信息成功",id);
        }
    }

    @Override
    public ResponseDate setRecruitFalse(String id) {
        int status = recruitDao.setRecruitFalse(id);
        if (status <= 0){
            return new ResponseDate(444,"更新招聘信息失败",status);
        }else {
            return new ResponseDate(200,"更新招聘信息成功",id);
        }
    }
}
