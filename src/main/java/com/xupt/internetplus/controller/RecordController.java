package com.xupt.internetplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xupt.internetplus.bean.HotPower;
import com.xupt.internetplus.bean.PassengerFlow;
import com.xupt.internetplus.bean.Record;
import com.xupt.internetplus.bean.RecordCount;
import com.xupt.internetplus.bean.RecordVO;
import com.xupt.internetplus.service.RecordService;
import com.xupt.internetplus.util.ResponseInfo;

/**
 * 检测日志相关接口 Created by 张涛 on 2017/4/15.
 */
@Controller
@RequestMapping(value = "/record")
public class RecordController {

	@Autowired
	private RecordService recordService;

	@RequestMapping(value = "/getAllRecord", method = RequestMethod.GET, produces = {
			"application/json;charset=UTF-8" })
	public @ResponseBody ResponseInfo getAllRecord() {
		ResponseInfo responseInfo = new ResponseInfo();
		List<Record> records = recordService.listAllRecord();
		List<RecordVO> recordVOList = recordService.recordToRecordVO(records);
		responseInfo.setData(recordVOList);
		return responseInfo;
	}

	@RequestMapping(value = "/getSexRecord", method = RequestMethod.GET, produces = {
			"application/json;charset=UTF-8" })
	public @ResponseBody ResponseInfo getSexRecord() {
		ResponseInfo responseInfo = new ResponseInfo();
		List<RecordCount> recordSexs = recordService.listSexRecord();
		responseInfo.setData(recordSexs);
		return responseInfo;
	}

	@RequestMapping(value = "/getAgeRecord", method = RequestMethod.GET, produces = {
			"application/json;charset=UTF-8" })
	public @ResponseBody ResponseInfo getAgeRecord() {
		ResponseInfo responseInfo = new ResponseInfo();
		List<RecordCount> recordAges = recordService.listAgeRecord();
		responseInfo.setData(recordAges);
		return responseInfo;
	}

	@RequestMapping(value = "/listTotalPeopleRecord", method = RequestMethod.GET, produces = {
			"application/json;charset=UTF-8" })
	public @ResponseBody ResponseInfo listTotalPeopleRecord() {
		ResponseInfo responseInfo = new ResponseInfo();
		List<PassengerFlow> passengerFlows = recordService.listTotalPeopleRecord();
		responseInfo.setData(passengerFlows);
		return responseInfo;
	}

	@RequestMapping(value = "/listHotPowerRecord", method = RequestMethod.GET, produces = {
			"application/json;charset=UTF-8" })
	public @ResponseBody ResponseInfo listHotPowerRecord() {
		ResponseInfo responseInfo = new ResponseInfo();
		List<HotPower> sotPowers = recordService.listHotPowerRecord();
		responseInfo.setData(sotPowers);
		return responseInfo;
	}
}
