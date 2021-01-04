package com.partTi.controller.user;

import com.partTi.pojo.user.CompanyUser;
import com.partTi.service.user.CommonUserService;
import com.partTi.service.user.CompanyUserService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials="true",maxAge = 3600)
@RequestMapping("/companyUser")
public class CompanyUserController {

    @Autowired
    private CompanyUserService companyUserService;

    @GetMapping("/getUser")
    public ResponseDate getCompanyUser(Integer id){
        return companyUserService.getCompanyUserById(id);
    }
}
