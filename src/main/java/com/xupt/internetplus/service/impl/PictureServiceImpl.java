package com.xupt.internetplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xupt.internetplus.bean.Picture;
import com.xupt.internetplus.dao.PictureDao;
import com.xupt.internetplus.service.PictrueService;

@Service
public class PictureServiceImpl implements PictrueService {

	@Autowired
	private PictureDao pictureDao;

	@Override
	public List<Picture> listAllPicture() {
		List<Picture> pictures = pictureDao.listAllPicture();
		return pictures;
	}

	@Override
	public List<Picture> listNewPicture() {
		List<Picture> pictures = pictureDao.listNewPicture();
		return pictures;
	}
}
