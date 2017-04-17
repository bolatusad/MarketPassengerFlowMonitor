package com.xupt.internetplus.dao;

import com.xupt.internetplus.bean.Record;

import java.util.List;

/**
 * 检测记录时间
 */
public interface RecordDao {

    /**
     * 获取所有的检测记录
     * @return
     */
    List<Record> listAllRecord();
}
