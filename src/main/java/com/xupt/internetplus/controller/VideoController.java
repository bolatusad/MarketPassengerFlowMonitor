package com.xupt.internetplus.controller;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Queue;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;
import com.xupt.internetplus.bean.Picture;
import com.xupt.internetplus.service.PictrueService;

/**
 *
 * 用于播放摄像头视频 Created by 张涛 on 2017/4/15.
 */
@Controller
@RequestMapping(value = "/video")
public class VideoController {

	@Autowired
	private HttpServletResponse response;
	@Autowired
	private PictrueService pictrueService;

	private static Queue<String> queue = null;

	// /**
	// * 通过摄像头的ID获取相对应的摄像头的图片信息
	// *
	// * @return
	// */
	// @RequestMapping(value = "/picture/{id}", method = RequestMethod.GET)
	// public @ResponseBody List<String> getPicture() {
	// List<String> imgs = new ArrayList<String>();
	// String pre = "/img/a";
	// String suf = ".jpg";
	// for (int i = 1; i <= 8; i++) {
	// String path = pre + i + suf;
	// imgs.add(path);
	// }
	// return imgs;
	// }

	@RequestMapping(value = "/path", method = RequestMethod.GET)
	public @ResponseBody void picture(String path) throws Exception {
		System.out.println(path);
		FileInputStream inputStream = new FileInputStream(path);
		int i = inputStream.available();
		// byte数组用于存放图片字节数据
		byte[] buff = new byte[i];
		inputStream.read(buff);
		// 记得关闭输入流
		inputStream.close();
		// 设置发送到客户端的响应内容类型
		response.setContentType("image/*");
		OutputStream out = response.getOutputStream();
		out.write(buff);
		// 关闭响应输出流
		out.close();
	}

	@RequestMapping(value = "/picture", method = RequestMethod.GET)
	public @ResponseBody List<String> getPicture() {
		List<Picture> pictures = Lists.newArrayList();
		pictures = pictrueService.listNewPicture();
		List<String> imgs = Lists.newArrayList();
		for (Picture picture : pictures) {
			imgs.add(picture.getLocalPath());
		}
		return imgs;
	}
}
