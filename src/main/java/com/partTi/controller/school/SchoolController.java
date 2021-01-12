package com.partTi.controller.school;

import com.partTi.pojo.school.School;
import com.partTi.service.school.SchoolService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials="true",maxAge = 3600)
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/getSchool")
    public ResponseDate getSchoolById(Integer id){
        return schoolService.getSchoolById(id);
    }

    @GetMapping("/getAllSchool")
    public ResponseDate getAllSchool(){
        return schoolService.getAllSchool();
    }
}
