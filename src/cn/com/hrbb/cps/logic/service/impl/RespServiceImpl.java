package cn.com.hrbb.cps.logic.service.impl;

import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;
import cn.com.hrbb.cps.SFQ01.bean.ResponseFQS01;
import cn.com.hrbb.cps.logic.service.CheckRequestMsg;
import cn.com.hrbb.cps.logic.service.RespService;

public class RespServiceImpl implements RespService{

	private CheckRequestMsg checkRequestMsg;
	@Override
	public ResponseFQS01 GetErrResp(String req, RequestFQS01 reqeust) {
		// TODO Auto-generated method stub
		ResponseFQS01 response = new ResponseFQS01();
		response.setResponseLength("000500");
		response.setTradeCode(reqeust.getTradeCode());
		response.setRespTradeSerial(reqeust.getTradeSerial());
		response.setRespCode(checkRequestMsg.CheckRequest(reqeust, req));
		response.setRespReason(checkRequestMsg.GetRespReason(checkRequestMsg.CheckRequest(reqeust, req)));
		return response;
	}
}
