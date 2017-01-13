package cn.com.hrbb.cps.app.service;

import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;
import cn.com.hrbb.cps.model.TradelogModel;
/**
 * ���������ӿ�
 * @author zm
 *
 */
public interface TradeLogService {
	
	/**
	 * ��������ⷽ��
	 * @param Request (TradelogModel)
	 */
	void InsertLog(TradelogModel Request);
	
	/**
	 * ��������ת�������ģ����
	 * 
	 * @param requestFQS01 (RequestFQS01)
	 * @param requestBody  (String)
	 * @return (TradelogModel)
	 */
	TradelogModel SwichToTradelogModel(RequestFQS01 requestFQS01,String requestBody);
	
	
}
