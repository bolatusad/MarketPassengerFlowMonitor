package com.xupt.internetplus.service.impl;

import com.xupt.internetplus.bean.Record;
import com.xupt.internetplus.bean.RecordVO;
import com.xupt.internetplus.dao.RecordDao;
import com.xupt.internetplus.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        if(records.size()<=0){
            return recordVOList;
        }
        for(Record record : records){
            RecordVO recordVO = new RecordVO();
            recordVO.setX(record.getDetectionX());
            recordVO.setY(record.getDetectionY());
            recordVO.setAge(record.getAge());
            recordVO.setGender(record.getGender());
            recordVOList.add(recordVO);
        }
        return recordVOList;
    }
}
