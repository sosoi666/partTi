package com.partTi.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@Service
@Slf4j
public class PictureService {
    private String ENDPOINT = "oss-cn-guangzhou.aliyuncs.com";//你自己的endPoint
    private String BUCKEY_NAME = "sosoi";//你自己的bucketName
    private String ACCESSKEYID = "LTAI4GJNKhFxBGEHGzNTLhFy";//你自己的accessKeyId
    private String ACCESSKEYSECRET = "HxC9DHWCbvmmLrI7S0QitqdhXRBTOf";//你自己的accessKeySecret

    public Object uploadPicture(MultipartFile uploadFile) {


        //1、给上传的图片生成新的文件名
        //1.1获取原始文件名
        String oldName = uploadFile.getOriginalFilename();
        //1.2使用IDUtils工具类生成新的文件名，新文件名 = newName + 文件后缀
        String newName = IDUtils.genImageName();
        assert oldName != null;
        newName = newName + oldName.substring(oldName.lastIndexOf("."));
        //1.3生成文件在服务器端存储的子目录
        String filePath = new DateTime().toString("yyyyMMdd/");

        String fileName = filePath+newName;

        //2、把图片上传到图片服务器
        //2.1获取上传的io流
        InputStream input = null;
        try {
            input = uploadFile.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(ENDPOINT, ACCESSKEYID, ACCESSKEYSECRET);

        // 上传文件流。
//        InputStream inputStream = new FileInputStream("<yourlocalFile>");
        ossClient.putObject(BUCKEY_NAME, fileName, input);
        ossClient.shutdown();
        return BUCKEY_NAME+ "." + ENDPOINT + "/" + fileName;

        //2.2调用FtpUtil工具类进行上传
//        return FtpUtil.putImages(input, filePath, newName);
    }

}
