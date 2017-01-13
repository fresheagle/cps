/**
 * 接口请求映射对象
 * @author zm
 * @time 20161010
 */

package cn.com.hrbb.cps.SFQ01.bean;

import java.util.List;

public class RequestFQS01 {
	private String TradeCode;                   //交易代码
	private String RequestLength;               //请求报文长度
	private String Channel;                     //渠道代码
	private String TradeSerial;                 //交易流水号
	private List<DimensionMsg> DimensionMSG;    //客户维度信息
	private String InstallmentType;             //分期类型
	
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
