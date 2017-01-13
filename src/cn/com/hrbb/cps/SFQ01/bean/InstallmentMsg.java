/**
 * 分期信息映射对象
 * @author zm
 * @time 20161010
 */

package cn.com.hrbb.cps.SFQ01.bean;

import java.util.List;

public class InstallmentMsg {
	private String InstallmentCode;                        //分期计划编号
	private String InstallmentType;                        //分期类型
	private String InstallmentDes;                         //分期描述
	private List<InstallmentPlanMsg> InstallmentPlanMSG;   //分期计划明细
	
	public InstallmentMsg(String installmentCode, String installmentType, String installmentDes,
			List<InstallmentPlanMsg> installmentPlanMSG) {
		super();
		InstallmentCode = installmentCode;
		InstallmentType = installmentType;
		InstallmentDes = installmentDes;
		InstallmentPlanMSG = installmentPlanMSG;
	}
	
	public InstallmentMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getInstallmentCode() {
		return InstallmentCode;
	}
	public void setInstallmentCode(String installmentCode) {
		InstallmentCode = installmentCode;
	}
	public String getInstallmentType() {
		return InstallmentType;
	}
	public void setInstallmentType(String installmentType) {
		InstallmentType = installmentType;
	}
	public String getInstallmentDes() {
		return InstallmentDes;
	}
	public void setInstallmentDes(String installmentDes) {
		InstallmentDes = installmentDes;
	}
	public List<InstallmentPlanMsg> getInstallmentPlanMSG() {
		return InstallmentPlanMSG;
	}

	public void setInstallmentPlanMSG(List<InstallmentPlanMsg> installmentPlanMSG) {
		InstallmentPlanMSG = installmentPlanMSG;
	}
}
