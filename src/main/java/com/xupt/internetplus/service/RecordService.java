package com.xupt.internetplus.service;

import com.xupt.internetplus.bean.Record;
import com.xupt.internetplus.bean.RecordVO;

import java.util.List;

/**
 * Created by 张涛 on 2017/4/15.
 */
public interface RecordService {

    /**
     * 获取所有的记录
     * @return
     */
    List<Record> listAllRecord();

    /**
     * 将record装换成RecordVO
     * @return
     */
    List<RecordVO> recordToRecordVO(List<Record> records);
}
