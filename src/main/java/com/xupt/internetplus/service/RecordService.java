package com.xupt.internetplus.service;

import java.util.List;

import com.xupt.internetplus.bean.HotPower;
import com.xupt.internetplus.bean.PassengerFlow;
import com.xupt.internetplus.bean.Record;
import com.xupt.internetplus.bean.RecordCount;
import com.xupt.internetplus.bean.RecordVO;

/**
 * Created by 张涛 on 2017/4/15.
 */
public interface RecordService {

	/**
	 * 获取所有的记录
	 * 
	 * @return
	 */
	List<Record> listAllRecord();

	/**
	 * 将record装换成RecordVO
	 * 
	 * @return
	 */
	List<RecordVO> recordToRecordVO(List<Record> records);

	/**
	 * 获取所有的性别记录
	 * 
	 * @return
	 */
	List<RecordCount> listSexRecord();

	List<RecordCount> listAgeRecord();

	List<PassengerFlow> listTotalPeopleRecord();

	List<HotPower> listHotPowerRecord();
}
