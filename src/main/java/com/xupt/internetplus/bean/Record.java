package com.xupt.internetplus.bean;

import java.util.Date;

/**
 * Created by 张涛 on 2017/4/15.
 */
public class Record {

	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 检测时间
	 */
	private Date detectionTime;

	/**
	 * 摄像头位置
	 */
	private String cameraLocation;

	/**
	 * 检测位置(中心点坐标x)
	 */
	private Double detectionX;

	/**
	 * 检测位置(中心点坐标Y)
	 */
	private Double detectionY;

	/**
	 * 检测位置(范围框宽度w)
	 */
	private Double detectionW;

	/**
	 * 检测位置(范围框长度H)
	 */
	private Double detectionH;

	/**
	 * 检测的性别
	 */
	private Integer gender;

	/**
	 * 检测的年龄
	 */
	private Integer age;

	/*
	 * 统计数量
	 */
	private Integer count;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDetectionTime() {
		return detectionTime;
	}

	public void setDetectionTime(Date detectionTime) {
		this.detectionTime = detectionTime;
	}

	public String getCameraLocation() {
		return cameraLocation;
	}

	public void setCameraLocation(String cameraLocation) {
		this.cameraLocation = cameraLocation;
	}

	public Double getDetectionX() {
		return detectionX;
	}

	public void setDetectionX(Double detectionX) {
		this.detectionX = detectionX;
	}

	public Double getDetectionY() {
		return detectionY;
	}

	public void setDetectionY(Double detectionY) {
		this.detectionY = detectionY;
	}

	public Double getDetectionW() {
		return detectionW;
	}

	public void setDetectionW(Double detectionW) {
		this.detectionW = detectionW;
	}

	public Double getDetectionH() {
		return detectionH;
	}

	public void setDetectionH(Double detectionH) {
		this.detectionH = detectionH;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
