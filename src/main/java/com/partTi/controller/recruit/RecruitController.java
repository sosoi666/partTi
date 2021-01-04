package com.partTi.controller.recruit;


import com.partTi.pojo.recruit.Recruit;
import com.partTi.service.recruit.RecruitService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials="true",maxAge = 3600)
@RequestMapping("/recruit")
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    @GetMapping("/getRecruits")
    private ResponseDate getRecruits(Recruit recruit, String findKey, Integer index, Integer pageSize, String sort){
        recruit.setId(findKey);
        recruit.setTitle(findKey);
        recruit.setDetail(findKey);
        return recruitService.getIndentDetailByAny(recruit,index,pageSize,sort);
    }

    @GetMapping("/getRecruit")
    private ResponseDate getRecruit(String id){
        return recruitService.getRecruitById(id);
    }

    @GetMapping("/countRecruit")
    private ResponseDate countRecruit(Recruit recruit,String sort){
        return recruitService.countRecruit(recruit,sort);
    }
}
