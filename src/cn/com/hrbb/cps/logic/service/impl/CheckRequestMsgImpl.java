package cn.com.hrbb.cps.logic.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.com.hrbb.cps.SFQ01.bean.DimensionMsg;
import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;
import cn.com.hrbb.cps.logic.service.CheckRequestMsg;

public class CheckRequestMsgImpl implements CheckRequestMsg{
	
	@Override
	public String CheckRequest(RequestFQS01 requestFQS01, String requestBody) {
		// TODO Auto-generated method stub
		if(!requestFQS01.getTradeCode().equals("SFQ01")){
			return "000001";
		}
		else if(requestFQS01.getChannel().isEmpty()){
			return "000002";
		}
		else if(requestFQS01.getTradeSerial().isEmpty()){
			return "000003";
		}
//		20161110 by zm
//		ȥ��ά����ϢΪ�յ��ж�
//		else if(requestFQS01.getDimensionMSG().isEmpty()){
//			return "000004";
//		}
		return "000000";
	}

	@Override
	public String GetRespReason(String RespCode) {
		// TODO Auto-generated method stub
		switch(RespCode){
		case "000000":
			return "�ɹ�";
		case "000001":
			return "���״������";
		case "000002":
			return "�������벻��Ϊ��";
		case "000003":
			return "������ˮ�Ų���Ϊ��";
		case "000004":
			return "ά����Ϣ����Ϊ��";
		default:
			return "δ�������";
		}
	}

	@Override
	public RequestFQS01 CheckDimMsg(RequestFQS01 request) {
		// TODO Auto-generated method stub
		if (request.getDimensionMSG().isEmpty() || request.getDimensionMSG() == null
				|| request.getDimensionMSG().get(0).getDimensionParameter().isEmpty()
				|| request.getDimensionMSG().get(0).getDimensionParameter() == null
				|| request.getDimensionMSG().get(0).getDimensionParameter().trim() == "") {
			request.setDimensionMSG(SetDimensionMSG("KHPJ", "�ͻ�����", "00000"));
			return request;
		}
		else
			return request;
	}

	@Override
	public List<DimensionMsg> SetDimensionMSG(String dimensionTypeCode, String dimensionName,
			String dimensionParameter) {
		// TODO Auto-generated method stub
		List<DimensionMsg> dimensionMSG = new ArrayList<DimensionMsg>();
		DimensionMsg dimensionmsg = new DimensionMsg(dimensionTypeCode, dimensionName, dimensionParameter);
		dimensionMSG.add(dimensionmsg);
		return dimensionMSG;
	}

}
