package com.partTi.service.recruit.impl;


import com.partTi.pojo.recruit.WorkResult;
import com.partTi.dao.recruit.*;
import com.partTi.service.recruit.WorkResultService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkResultServiceImpl implements WorkResultService {

    @Autowired
    private WorkResultDao workResultDao;

    @Override
    public ResponseDate getWorkResultByAny(WorkResult workResult, Integer index, Integer pageSize, String sort) {
        List<WorkResult> workResults = workResultDao.getWorkResultByAny(workResult,index,pageSize,sort);
        if (workResults != null){
            return new ResponseDate(200,"查询投递结果成功",workResults);
        }else {
            return new ResponseDate(444,"查询投递结果失败");
        }
    }

    @Override
    public ResponseDate countWorkResultByAny(WorkResult workResult, String sort) {
        int result = workResultDao.countWorkResultByAny(workResult,sort);
        if (result < 0){
            return new ResponseDate(444,"统计投递结果失败",result);
        }else {
            return new ResponseDate(200,"统计投递结果成功",result);
        }
    }

    @Override
    public ResponseDate getWorkResultById(Integer id) {
        WorkResult workResult = workResultDao.getWorkResultById(id);
        if (workResult != null){
            return new ResponseDate(200,"查询投递结果成功",workResult);
        }else {
            return new ResponseDate(444,"查询投递结果失败");
        }
    }

    @Override
    public ResponseDate insertWorkResult(WorkResult workResult) {
        int status = workResultDao.insertWorkResult(workResult);
        if (status <= 0){
            return new ResponseDate(444,"添加投递结果失败",status);
        }else {
            return new ResponseDate(200,"添加投递结果成功",workResult);
        }
    }

    @Override
    public ResponseDate updateWorkResult(WorkResult workResult) {
        int status = workResultDao.updateWorkResult(workResult);
        if (status <= 0){
            return new ResponseDate(444,"更新投递结果失败",status);
        }else {
            return new ResponseDate(200,"更新投递结果成功",workResult);
        }
    }

    @Override
    public ResponseDate deleteWorkResult(Integer id) {
        int status = workResultDao.deleteWorkResult(id);
        if (status <= 0){
            return new ResponseDate(444,"删除投递结果失败",status);
        }else {
            return new ResponseDate(200,"删除投递结果成功",id);
        }
    }
}
