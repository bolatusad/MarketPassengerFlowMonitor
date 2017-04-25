package com.xupt.internetplus.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.xupt.internetplus.bean.PassengerFlow;
import com.xupt.internetplus.bean.Record;
import com.xupt.internetplus.bean.RecordCount;
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
	public List<RecordCount> listSexRecord() {
		List<Record> records = recordDao.listSexRecord();
		List<RecordCount> recordSexs = Lists.newArrayList();
		if (records.size() <= 0) {
			return recordSexs;
		}
		for (Record record : records) {
			RecordCount recordSex = new RecordCount();
			recordSex.setValue(record.getCount());
			recordSex.setName(SexEunm.getEnum(record.getGender()).getMessage());
			recordSexs.add(recordSex);
		}
		return recordSexs;
	}

	@Override
	public List<RecordCount> listAgeRecord() {
		List<RecordCount> records = recordDao.listAgeRecord();
		return records;
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
			obj.add(record.getDetectionTime().getTime());
			obj.add(record.getCount());
			passengerFlow.setValue(obj);
			passengerFlows.add(passengerFlow);
		}
		return passengerFlows;
	}

	@Override
	public List<Object> listHotPowerRecord() {
		List<Record> records = recordDao.listHotPowerRecord();
		Map<String, Integer> tempHotPictureData = new HashMap<>();
		for (Record record : records) {
			Double x = record.getDetectionX();
			Double y = record.getDetectionY();
			// 暂定分块为100*100的正方形
			Integer resultX = x.intValue() / 100 * 100 + 50;
			Integer resultY = y.intValue() / 100 * 100 + 50;
			String key = resultX + "_" + resultY;
			Integer sum = tempHotPictureData.get(key);
			// 判断map中是否已经存在这个点，如果已经存在，就给sum加1；不存在就放入一项
			if (sum == null) {
				tempHotPictureData.put(key, 1);
			} else {
				tempHotPictureData.remove(key);
				sum = sum + 1;
				tempHotPictureData.put(key, sum);
				// tempHotPictureData.replace(key, sum, sum++);
			}
		}
		// 遍历Map，将数据填入
		List<Object> hotPictureDatas = new ArrayList<Object>();
		for (String key : tempHotPictureData.keySet()) {
			List<Object> hotPictureData = new ArrayList<Object>();
			String[] tempXY = key.split("_");
			hotPictureData.add(tempXY[0]);
			hotPictureData.add(tempXY[1]);
			hotPictureData.add(tempHotPictureData.get(key));
			hotPictureDatas.add(hotPictureData);
		}

		return hotPictureDatas;
	}

}
