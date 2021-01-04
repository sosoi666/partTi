package com.partTi.controller.location;


import com.partTi.service.location.CitiesService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials="true",maxAge = 3600)
@RequestMapping("/city")
public class CitiesController {

    @Autowired
    private CitiesService citiesService;

    @GetMapping("getCity")
    public ResponseDate getCityById(Integer id){
        return citiesService.getCityById(id);
    }
}
