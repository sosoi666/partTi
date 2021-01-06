package com.partTi.controller.location;


import com.partTi.service.location.ProvinceService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials="true",maxAge = 3600)
@RequestMapping("/province")
public class ProvincesController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("getProvinces")
    public ResponseDate getProvinces(){
        return provinceService.getAllProvinces();
    }

    @GetMapping("getProvinceById")
    public ResponseDate getProvinces(Integer id){
        return provinceService.getProvincesById(id);
    }
}
