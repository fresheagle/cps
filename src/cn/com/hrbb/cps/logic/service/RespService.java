package cn.com.hrbb.cps.logic.service;

import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;
import cn.com.hrbb.cps.SFQ01.bean.ResponseFQS01;

public interface RespService {
	/**
	 * 请求报文校验不通过，返回响应报文方法
	 * @param req (String)
	 * @param reqeust (RequestFQS01)
	 * @return (ResponseFQS01) 响应报文体
	 */
	ResponseFQS01 GetErrResp(String req,RequestFQS01 reqeust);
	
	
}
