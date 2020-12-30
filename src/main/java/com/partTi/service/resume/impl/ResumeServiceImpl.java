package com.partTi.service.resume.impl;

import com.partTi.dao.resume.ResumeDao;
import com.partTi.pojo.resume.Resume;
import com.partTi.service.resume.ResumeService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public ResponseDate getResumeByAny(Resume resume, Integer index, Integer pageSize, String sort) {
        List<Resume> resumes = resumeDao.getResumeByAny(resume,index,pageSize,sort);
        if (resumes != null){
            return new ResponseDate(200,"查询简历成功",resumes);
        }else {
            return new ResponseDate(444,"查询简历失败");
        }
    }

    @Override
    public ResponseDate countResume(Resume resume, String sort) {
        int result = resumeDao.countResume(resume,sort);
        if (result < 0){
            return new ResponseDate(444,"统计简历数量失败");
        }else {
            return new ResponseDate(200,"统计数量成功",result);
        }
    }

    @Override
    public ResponseDate getResumeById(Integer id) {
        Resume resume = resumeDao.getResumeById(id);
        if (resume != null){
            return new ResponseDate(200,"查询简历成功",resume);
        }else {
            return new ResponseDate(444,"查询简历失败");
        }
    }

    @Override
    public ResponseDate insertResume(Resume resume) {
        int status = resumeDao.insertResume(resume);
        if (status <=0){
            return new ResponseDate(444,"添加简历失败",status);
        }else {
            return new ResponseDate(200,"添加简历成功",resume);
        }
    }

    @Override
    public ResponseDate updateResume(Resume resume) {
        int status = resumeDao.updateResume(resume);
        if (status <=0){
            return new ResponseDate(444,"更新简历失败",status);
        }else {
            return new ResponseDate(200,"更新简历成功",resume);
        }
    }

    @Override
    public ResponseDate deleteResume(Integer id) {
        int status = resumeDao.deleteResume(id);
        if (status <=0){
            return new ResponseDate(444,"删除简历失败",status);
        }else {
            return new ResponseDate(200,"删除简历成功",id);
        }
    }
}
