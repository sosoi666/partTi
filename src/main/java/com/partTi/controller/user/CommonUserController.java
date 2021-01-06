package com.partTi.controller.user;


import com.partTi.pojo.user.CommonUser;
import com.partTi.pojo.user.User;
import com.partTi.service.user.CommonUserService;
import com.partTi.service.user.CompanyUserService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/updateCommonUser")
    public ResponseDate updateCommonUser(@RequestBody CommonUser commonUser){
        return commonUserService.updateCommonUser(commonUser);
    }
}
