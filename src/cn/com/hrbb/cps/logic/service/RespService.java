package cn.com.hrbb.cps.logic.service;

import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;
import cn.com.hrbb.cps.SFQ01.bean.ResponseFQS01;

public interface RespService {
	/**
	 * ������У�鲻ͨ����������Ӧ���ķ���
	 * @param req (String)
	 * @param reqeust (RequestFQS01)
	 * @return (ResponseFQS01) ��Ӧ������
	 */
	ResponseFQS01 GetErrResp(String req,RequestFQS01 reqeust);
	
	
}
