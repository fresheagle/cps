/**
 * 客户维度信息映射对象
 * @author zm
 * @time 20161010
 */

package cn.com.hrbb.cps.SFQ01.bean;

public class DimensionMsg {
	private String DimensionTypeCode;    //客户维度类型
	private String DimensionName;        //客户维度类型描述
	private String DimensionParameter;   //维度参数代码
	
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
