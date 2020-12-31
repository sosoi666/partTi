package com.partTi.controller.user;


import com.partTi.pojo.user.User;
import com.partTi.service.user.UserService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin(allowCredentials="true",maxAge = 3600)
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public ResponseDate login(@RequestBody User user, HttpServletRequest request){
        User tUser = (User) userService.getUserByUsername(user.getUserName()).getData();
        if (tUser == null){
            return new ResponseDate(444,"登录失败");
        }
        if (tUser.getPassword().equals(user.getPassword())){
            request.getSession().setAttribute("loginUser",tUser);
            return new ResponseDate(200,"登录成功",tUser);
        }else {
            return new ResponseDate(444,"登录失败");
        }
    }

    @GetMapping("/getCurrentUser")
    @ResponseBody
    public ResponseDate getCurrentUser(HttpServletRequest request){
        User loginUser = (User) request.getSession().getAttribute("loginUser");
        System.out.println(loginUser);
        return new ResponseDate(200,"获取当前用户成功",loginUser);
    }

    @GetMapping("/logout")
    public ResponseDate logout(HttpServletRequest request){
        request.getSession().setAttribute("loginUser",null);
        return new ResponseDate(200,"退出登录成功");
    }
}
