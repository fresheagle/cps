/**
 * �ӿ�����ӳ�����
 * @author zm
 * @time 20161010
 */

package cn.com.hrbb.cps.SFQ01.bean;

import java.util.List;

public class RequestFQS01 {
	private String TradeCode;                   //���״���
	private String RequestLength;               //�����ĳ���
	private String Channel;                     //��������
	private String TradeSerial;                 //������ˮ��
	private List<DimensionMsg> DimensionMSG;    //�ͻ�ά����Ϣ
	private String InstallmentType;             //��������
	
	public RequestFQS01(String tradeCode,String requestLength,String channel, String tradeSerial, List<DimensionMsg> dimensionMSG,
			String installmentType) {
		super();
		TradeCode = tradeCode;
		RequestLength = requestLength;
		Channel = channel;
		TradeSerial = tradeSerial;
		DimensionMSG = dimensionMSG;
		InstallmentType = installmentType;
	}
	
	public String getRequestLength() {
		return RequestLength;
	}

	public void setRequestLength(String requestLength) {
		RequestLength = requestLength;
	}

	public RequestFQS01() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getTradeCode() {
		return TradeCode;
	}
	public void setTradeCode(String tradeCode) {
		TradeCode = tradeCode;
	}
	public String getChannel() {
		return Channel;
	}
	public void setChannel(String channel) {
		Channel = channel;
	}
	public String getTradeSerial() {
		return TradeSerial;
	}
	public void setTradeSerial(String tradeSerial) {
		TradeSerial = tradeSerial;
	}
	public List<DimensionMsg> getDimensionMSG() {
		return DimensionMSG;
	}
	public void setDimensionMSG(List<DimensionMsg> dimensionMSG) {
		DimensionMSG = dimensionMSG;
	}
	public String getInstallmentType() {
		return InstallmentType;
	}
	public void setInstallmentType(String installmentType) {
		InstallmentType = installmentType;
	}
}
