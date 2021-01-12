package com.partTi.controller.recruit;


import com.partTi.pojo.recruit.Recruit;
import com.partTi.service.recruit.RecruitService;
import com.partTi.utils.ResponseDate;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin(allowCredentials="true",maxAge = 3600)
@RequestMapping("/recruit")
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    @GetMapping("/getRecruits")
    public ResponseDate getRecruits(Recruit recruit, String findKey, Integer index, Integer pageSize, String sort){
        recruit.setId(findKey);
        recruit.setTitle(findKey);
        recruit.setDetail(findKey);
        return recruitService.getIndentDetailByAny(recruit,index,pageSize,sort);
    }

    @GetMapping("/getRecruit")
    public ResponseDate getRecruit(String id){
        return recruitService.getRecruitById(id);
    }

    @GetMapping("/countRecruit")
    public ResponseDate countRecruit(Recruit recruit,String sort){
        return recruitService.countRecruit(recruit,sort);
    }

    @PostMapping("/updateRecruit")
    public ResponseDate updateRecruit(@RequestBody Recruit recruit){
        return recruitService.updateRecruit(recruit);
    }

    @PostMapping("addRecruit")
    public ResponseDate addRecruit(@RequestBody Recruit recruit){
        Date date = new Date();
        recruit.setCreateTime(date);
        String year=String.format("%tY", date);
        String mon=String .format("%tm", date);
        String day=String .format("%td", date);
        String rand1 = RandomStringUtils.randomAlphanumeric(3);
        String rand2 = RandomStringUtils.randomAlphanumeric(3);
        String idString = "ZP"+recruit.getCid()+rand1+year+mon+day+recruit.getCategoryId();
        recruit.setId(idString);
        recruit.setState(1);
        return recruitService.insertRecruit(recruit);
    }

    @PostMapping("setRecruitTrue")
    public ResponseDate setRecruitTrue(@RequestBody Recruit recruit){
        return recruitService.setRecruitTrue(recruit.getId());
    }

    @PostMapping("setRecruitFalse")
    public ResponseDate setRecruitFalse(@RequestBody Recruit recruit){
        return recruitService.setRecruitFalse(recruit.getId());
    }
}
