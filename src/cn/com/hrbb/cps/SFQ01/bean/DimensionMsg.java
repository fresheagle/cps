/**
 * �ͻ�ά����Ϣӳ�����
 * @author zm
 * @time 20161010
 */

package cn.com.hrbb.cps.SFQ01.bean;

public class DimensionMsg {
	private String DimensionTypeCode;    //�ͻ�ά������
	private String DimensionName;        //�ͻ�ά����������
	private String DimensionParameter;   //ά�Ȳ�������
	
	public DimensionMsg(String dimensionTypeCode, String dimensionName, String dimensionParameter) {
		super();
		DimensionTypeCode = dimensionTypeCode;
		DimensionName = dimensionName;
		DimensionParameter = dimensionParameter;
	}
	
	public DimensionMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getDimensionTypeCode() {
		return DimensionTypeCode;
	}
	public void setDimensionTypeCode(String dimensionTypeCode) {
		DimensionTypeCode = dimensionTypeCode;
	}
	public String getDimensionName() {
		return DimensionName;
	}
	public void setDimensionName(String dimensionName) {
		DimensionName = dimensionName;
	}
	public String getDimensionParameter() {
		return DimensionParameter;
	}
	public void setDimensionParameter(String dimensionParameter) {
		DimensionParameter = dimensionParameter;
	}
	
}
