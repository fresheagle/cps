package cn.com.hrbb.cps.app.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;
import cn.com.hrbb.cps.app.service.TradeLogService;
import cn.com.hrbb.cps.dao.mapper.TradelogModelMapper;
import cn.com.hrbb.cps.model.TradelogModel;

@Service
public class TradeLogServiceImpl implements TradeLogService{

	@Autowired
	private TradelogModelMapper TradelogModelMap;
	
	@Override
	public void InsertLog(TradelogModel Request) {
		// TODO Auto-generated method stub
		System.out.println("InsertLogImpl");
		TradelogModelMap.InsertLog(Request);
	}

	@Override
	public TradelogModel SwichToTradelogModel(RequestFQS01 requestFQS01,String requestBody){
		
		TradelogModel tradelogmodel = new TradelogModel();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		System.out.println("SwichToTradelogModel");
		tradelogmodel.setTradecode(requestFQS01.getTradeCode());
		tradelogmodel.setTradeserial(requestFQS01.getTradeSerial());
		tradelogmodel.setChannelcode(requestFQS01.getChannel());
		tradelogmodel.setContent(requestBody);
		tradelogmodel.setRequesttime(dateFormat.format(new Date()));
		tradelogmodel.setResponetime("");
		tradelogmodel.setReasoncode("");

		return tradelogmodel;
	}
}
