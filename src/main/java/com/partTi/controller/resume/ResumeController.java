package com.partTi.controller.resume;


import com.partTi.pojo.recruit.Recruit;
import com.partTi.pojo.resume.Resume;
import com.partTi.service.recruit.RecruitService;
import com.partTi.service.resume.ResumeService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin(allowCredentials="true",maxAge = 3600)
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/getResumes")
    public ResponseDate getResumes(Resume resume,Integer index,Integer pageSize,String sort){
        return resumeService.getResumeByAny(resume,index,pageSize,sort);
    }

    @GetMapping("/getResume")
    public ResponseDate getResume(Integer id){
        return resumeService.getResumeById(id);
    }

    @GetMapping("/countResume")
    public ResponseDate countResume(Resume resume,String sort){
        return resumeService.countResume(resume,sort);
    }

    @PostMapping("/addResume")
    public ResponseDate addResume(@RequestBody Resume resume){
        Date date = new Date();
        resume.setCreateTime(date);
        System.out.println(resume);
        return resumeService.insertResume(resume);
    }

    @PostMapping("/updateResume")
    public ResponseDate updateResume(@RequestBody Resume resume){
        return resumeService.updateResume(resume);
    }

    @PostMapping("/deleteResume")
    public ResponseDate deleteResume(@RequestBody Resume resume){
        return resumeService.deleteResume(resume.getId());
    }
}
