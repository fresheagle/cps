package cn.com.hrbb.cps.app.service;

import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;
import cn.com.hrbb.cps.model.TradelogModel;
/**
 * 请求报文入库接口
 * @author zm
 *
 */
public interface TradeLogService {
	
	/**
	 * 请求报文入库方法
	 * @param Request (TradelogModel)
	 */
	void InsertLog(TradelogModel Request);
	
	/**
	 * 把请求报文转化成入库模板类
	 * 
	 * @param requestFQS01 (RequestFQS01)
	 * @param requestBody  (String)
	 * @return (TradelogModel)
	 */
	TradelogModel SwichToTradelogModel(RequestFQS01 requestFQS01,String requestBody);
	
	
}
