package com.xupt.internetplus.dao;

import java.util.List;

import com.xupt.internetplus.bean.Record;

/**
 * 检测记录时间
 */
public interface RecordDao {

	/**
	 * 获取所有的检测记录
	 * 
	 * @return
	 */
	List<Record> listAllRecord();

	/**
	 * 获取性别数量
	 * 
	 * @return
	 * @return List<RecordSex>
	 * @exception @createTime：Apr
	 *                22, 2017
	 * @author: WangZelan
	 */
	List<Record> listSexRecord();

	List<Record> listAgeRecord();

	List<Record> listTotalPeopleRecord();
}
