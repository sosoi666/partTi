package com.partTi.controller.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.partTi.utils.PictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

import com.partTi.utils.ResponseDate;
import org.springframework.web.bind.annotation.*;


//图片上传控制层
@RestController
@Slf4j
@CrossOrigin(allowCredentials="true",maxAge = 3600)
@RequestMapping("/pic")
public class PictureController {

    @Autowired
    private PictureService pictureService;


    @PostMapping("/upload")
    public ResponseDate pictureUpload(@RequestParam(value = "file") MultipartFile uploadFile) {
        long begin = System.currentTimeMillis();
        String json = "";
        ResponseDate responseDate = null;
        try {
            Object result = pictureService.uploadPicture(uploadFile);
            responseDate = new ResponseDate(200,"图片上传成功",result);
            json = new ObjectMapper().writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        log.info("任务结束，共耗时：[" + (end-begin) + "]毫秒");
        return responseDate;
    }

    @PostMapping("/uploads")
    public ResponseDate picturesUpload(@RequestParam(value = "file") MultipartFile[] uploadFile) {
        long begin = System.currentTimeMillis();
        Map<Object, Object> map = new HashMap<>(10);

        int count = 0;
        for (MultipartFile file : uploadFile) {
            Object result = pictureService.uploadPicture(file);
            map.put(count, result);
            count++;
        }
        long end = System.currentTimeMillis();
        log.info("任务结束，共耗时：[" + (end-begin) + "]毫秒");
//        return map;
        return new ResponseDate(200,"图片上传成功",map);
    }




}
