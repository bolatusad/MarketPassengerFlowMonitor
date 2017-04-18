package com.xupt.internetplus.dao;

import java.util.List;

import com.xupt.internetplus.bean.Picture;

public interface PictureDao {
	List<Picture> listAllPicture();

	List<Picture> listNewPicture();
}
