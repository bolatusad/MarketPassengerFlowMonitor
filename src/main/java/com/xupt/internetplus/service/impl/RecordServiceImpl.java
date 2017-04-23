package com.xupt.internetplus.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.xupt.internetplus.bean.PassengerFlow;
import com.xupt.internetplus.bean.Record;
import com.xupt.internetplus.bean.RecordSex;
import com.xupt.internetplus.bean.RecordVO;
import com.xupt.internetplus.dao.RecordDao;
import com.xupt.internetplus.eunm.SexEunm;
import com.xupt.internetplus.service.RecordService;

/**
 * Created by 张涛 on 2017/4/15.
 */
@Service
public class RecordServiceImpl implements RecordService {

	@Autowired
	private RecordDao recordDao;

	@Override
	public List<Record> listAllRecord() {
		List<Record> records = recordDao.listAllRecord();
		return records;
	}

	@Override
	public List<RecordVO> recordToRecordVO(List<Record> records) {
		List<RecordVO> recordVOList = new ArrayList<RecordVO>();
		if (records.size() <= 0) {
			return recordVOList;
		}
		for (Record record : records) {
			RecordVO recordVO = new RecordVO();
			recordVO.setX(record.getDetectionX());
			recordVO.setY(record.getDetectionY());
			recordVO.setAge(record.getAge());
			recordVO.setGender(SexEunm.getEnum(record.getGender()).getMessage());
			recordVOList.add(recordVO);
		}
		return recordVOList;
	}

	@Override
	public List<RecordSex> listSexRecord() {
		List<Record> records = recordDao.listSexRecord();
		List<RecordSex> recordSexs = Lists.newArrayList();
		if (records.size() <= 0) {
			return recordSexs;
		}
		for (Record record : records) {
			RecordSex recordSex = new RecordSex();
			recordSex.setCount(record.getCount());
			recordSex.setGender(SexEunm.getEnum(record.getGender()).getMessage());
			recordSexs.add(recordSex);
		}
		return recordSexs;
	}

	@Override
	public List<PassengerFlow> listTotalPeopleRecord() {
		List<Record> records = recordDao.listTotalPeopleRecord();
		List<PassengerFlow> passengerFlows = Lists.newArrayList();
		if (records.size() <= 0) {
			return passengerFlows;
		}
		for (Record record : records) {
			PassengerFlow passengerFlow = new PassengerFlow();
			List<Object> obj = Lists.newArrayList();
			obj.add(record.getDetectionTime());
			obj.add(record.getCount());
			passengerFlow.setValue(obj);
			passengerFlows.add(passengerFlow);
		}
		return passengerFlows;
	}
}
