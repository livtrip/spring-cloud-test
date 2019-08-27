package com.itmuch.cloud.study.common.util;

import org.apache.commons.net.util.Base64;

public class ImgUtil {
	
	/**
	 * 获取base64图片数据
	 * @param imgUrl
	 * @return
	 */
	public static String getBase64Img(String imgUrl) {
		byte[] imgbyte = ImgConvertByteArray.img2byteArray(imgUrl);
		if(imgbyte == null) return "";
		return Base64.encodeBase64String(imgbyte);
	}
	
}
