/**
 * 接口响应映射对象
 * @author zm
 * @time 20161010
 */

package cn.com.hrbb.cps.SFQ01.bean;

import java.util.List;

public class ResponseFQS01 {
	private String TradeCode;                       //交易代码
	private String ResponseLength;                  //响应报文长度
	private String RespTradeSerial;                 //交易响应流水号
	private String RespCode;                        //交易响应代码
	private String RespReason;                      //交易响应原因
	private List<InstallmentMsg> InstallmentMSG;    //分期信息
	
	public ResponseFQS01(String tradeCode, String ResponseLength, String respTradeSerial, String respCode, String respReason,
			List<InstallmentMsg> installmentMSG) {
		super();
		TradeCode = tradeCode;
		RespTradeSerial = respTradeSerial;
		RespCode = respCode;
		RespReason = respReason;
		InstallmentMSG = installmentMSG;
	}
	
	public ResponseFQS01() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getResponseLength() {
		return ResponseLength;
	}

	public void setResponseLength(String responseLength) {
		ResponseLength = responseLength;
	}

	public String getTradeCode() {
		return TradeCode;
	}
	public void setTradeCode(String tradeCode) {
		TradeCode = tradeCode;
	}
	public String getRespTradeSerial() {
		return RespTradeSerial;
	}
	public void setRespTradeSerial(String respTradeSerial) {
		RespTradeSerial = respTradeSerial;
	}
	public String getRespCode() {
		return RespCode;
	}
	public void setRespCode(String respCode) {
		RespCode = respCode;
	}
	public String getRespReason() {
		return RespReason;
	}
	public void setRespReason(String respReason) {
		RespReason = respReason;
	}
	public List<InstallmentMsg> getInstallmentMSG() {
		return InstallmentMSG;
	}
	public void setInstallmentMSG(List<InstallmentMsg> installmentMSG) {
		InstallmentMSG = installmentMSG;
	}
}
