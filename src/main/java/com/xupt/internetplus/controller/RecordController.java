package com.xupt.internetplus.controller;

import com.xupt.internetplus.bean.Record;
import com.xupt.internetplus.bean.RecordVO;
import com.xupt.internetplus.service.RecordService;
import com.xupt.internetplus.util.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 检测日志相关接口
 * Created by 张涛 on 2017/4/15.
 */
@Controller
@RequestMapping(value = "/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @RequestMapping(value = "/getAllRecord",method = RequestMethod.GET,produces = { "application/json;charset=UTF-8" })
    public @ResponseBody ResponseInfo getAllRecord(){
        ResponseInfo responseInfo = new ResponseInfo();
        List<Record> records = recordService.listAllRecord();
        List<RecordVO> recordVOList = recordService.recordToRecordVO(records);
        responseInfo.setData(recordVOList);
        return responseInfo;
    }
}
