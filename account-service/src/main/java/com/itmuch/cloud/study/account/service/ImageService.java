package com.itmuch.cloud.study.account.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    String  uploadImage( String imageUrl);

    String uploadImage(MultipartFile multipartFile);
}
