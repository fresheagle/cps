package cn.com.hrbb.cps.logic.service;

import java.util.List;

import cn.com.hrbb.cps.SFQ01.bean.DimensionMsg;
import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;

/**
 * 校验请求报文接口
 * @author zm
 *
 */
public interface CheckRequestMsg {

	/**
	 * 校验请求报文方法
	 * @param requestFQS01 (RequestFQS01)
	 * @param requestBody  (String)
	 * @return (String) 原因代码
	 */
	String CheckRequest(RequestFQS01 requestFQS01, String requestBody);
	
	/**
	 * 获取响应报文原因描述方法
	 * @param RespCode (String)
	 * @return (String) 原因描述
	 */
	String GetRespReason(String RespCode);
	
	/**
	 * 检查请求报文中维度信息是否为空，若为空则赋默认值
	 * @param request (RequestFQS01)
	 * @return (RequestFQS01) 请求报文类
	 */
	RequestFQS01 CheckDimMsg(RequestFQS01 request);
	
	/**
	 * 为维度信息为空的请求报文赋默认值
	 * @param dimensionTypeCode
	 * @param dimensionName
	 * @param dimensionParameter
	 * @return (List<DimensionMsg>)
	 */
	List<DimensionMsg> SetDimensionMSG(String dimensionTypeCode, String dimensionName, String dimensionParameter);
}
