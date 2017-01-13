package cn.com.hrbb.cps.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;
import cn.com.hrbb.cps.SFQ01.bean.ResponseFQS01;
import cn.com.hrbb.cps.app.service.TradeLogService;
import cn.com.hrbb.cps.logic.service.CheckRequestMsg;

@RestController
@RequestMapping(value = "/surface/SFQ")
public class SurfaceServerFQS01 {
	
	@Autowired
	TradeLogService tradeLogService;
	CheckRequestMsg checkRequestMsg;
	
	@ResponseBody
	@RequestMapping(value = { "/01" }, method = RequestMethod.POST, produces = "application/json")
	public ResponseFQS01 PushSurfaceServerFQS01(@RequestBody String Request){
		System.out.println("服务端输出开始：");
    	System.out.println(Request);
    	System.out.println("服务端输出结束！");
    	Gson gson = new Gson();
    	RequestFQS01 ResqFQS01 = gson.fromJson(Request, RequestFQS01.class);
    	System.out.println("####"+ResqFQS01.getTradeSerial()+"####");
    	String json = gson.toJson(ResqFQS01);
    	System.out.println(json);
    	
    	tradeLogService.InsertLog(tradeLogService.SwichToTradelogModel(ResqFQS01, Request));
    	
    	if(checkRequestMsg.CheckRequest(ResqFQS01, Request)!= "000000"){
    		
    	}
    	
    	ResponseFQS01 responseFQS01 = new ResponseFQS01();
    	responseFQS01.setRespReason("成功");
    	return responseFQS01;
	}
}
