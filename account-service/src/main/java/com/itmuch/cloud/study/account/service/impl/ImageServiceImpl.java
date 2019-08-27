package com.itmuch.cloud.study.account.service.impl;

import com.itmuch.cloud.study.account.service.ImageService;
import com.itmuch.cloud.study.common.constant.Constants;
import com.itmuch.cloud.study.common.oss.OSSFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * 〈一句话功能简述〉<br>
 * Description:
 *
 * @author xierongli
 * @create 2019-08-27 20:46
 */
@Service
public class ImageServiceImpl implements ImageService {

    @Override
    public String  uploadImage( String imageUrl){
        String url = null;
        try {
            InputStream input = new URL(imageUrl).openStream();
            url = OSSFactory.build(Constants.CloudService.ALIYUN.getValue()).uploadSuffix(input, ".jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;
    }

    @Override
    public String uploadImage(MultipartFile multipartFile){
        String url = null;
        try {
            url = OSSFactory.build(Constants.CloudService.ALIYUN.getValue()).uploadSuffix(multipartFile.getInputStream(), ".jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;
    }
}
