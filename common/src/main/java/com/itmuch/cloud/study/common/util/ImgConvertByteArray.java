package com.itmuch.cloud.study.common.util;

import java.io.*;

public class ImgConvertByteArray {

	/**
	 * 二进制数据转图片
	 *
	 * @param imgData
	 * @param imgUrl
	 */
	public static void byteArray2Img(byte[] imgData, String imgUrl) {
		File saveImg = null;
		FileOutputStream fos = null;
		try {
			saveImg = new File(imgUrl);
			if (!saveImg.getParentFile().exists()) {
				saveImg.getParentFile().mkdirs();
			}
			fos = new FileOutputStream(saveImg);
			fos.write(imgData);
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 图片转二进制数据
	 *
	 * @param imgUrl
	 * @return
	 */
	public static byte[] img2byteArray(String imgUrl) {

		File file = null;
		FileInputStream fis = null;
		byte[] img = null;
		try {
			file = new File(imgUrl);
			if (file.exists()) {
				fis = new FileInputStream(imgUrl);
				img = new byte[(int) file.length()];
				fis.read(img);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return img;
	}
	
}
