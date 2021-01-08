package com.partTi.controller.recruit;


import com.partTi.pojo.recruit.Recruit;
import com.partTi.service.recruit.RecruitService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
