package com.partTi.controller.user;


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
@RequestMapping("/commonUser")
public class CommonUserController {

    @Autowired
    private CommonUserService commonUserService;

    @GetMapping("/getUser")
    public ResponseDate getCommonUser(Integer id){
        return commonUserService.getCommonUserById(id);
    }
}
