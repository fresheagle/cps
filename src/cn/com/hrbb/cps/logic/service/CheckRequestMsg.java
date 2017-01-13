package cn.com.hrbb.cps.logic.service;

import java.util.List;

import cn.com.hrbb.cps.SFQ01.bean.DimensionMsg;
import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;

/**
 * У�������Ľӿ�
 * @author zm
 *
 */
public interface CheckRequestMsg {

	/**
	 * У�������ķ���
	 * @param requestFQS01 (RequestFQS01)
	 * @param requestBody  (String)
	 * @return (String) ԭ�����
	 */
	String CheckRequest(RequestFQS01 requestFQS01, String requestBody);
	
	/**
	 * ��ȡ��Ӧ����ԭ����������
	 * @param RespCode (String)
	 * @return (String) ԭ������
	 */
	String GetRespReason(String RespCode);
	
	/**
	 * �����������ά����Ϣ�Ƿ�Ϊ�գ���Ϊ����Ĭ��ֵ
	 * @param request (RequestFQS01)
	 * @return (RequestFQS01) ��������
	 */
	RequestFQS01 CheckDimMsg(RequestFQS01 request);
	
	/**
	 * Ϊά����ϢΪ�յ������ĸ�Ĭ��ֵ
	 * @param dimensionTypeCode
	 * @param dimensionName
	 * @param dimensionParameter
	 * @return (List<DimensionMsg>)
	 */
	List<DimensionMsg> SetDimensionMSG(String dimensionTypeCode, String dimensionName, String dimensionParameter);
}
