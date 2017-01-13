/**
 * 分期计划明细映射类
 * @author zm
 * @time 20161010
 */

package cn.com.hrbb.cps.SFQ01.bean;

public class InstallmentPlanMsg {
	private String StageNum;            //期数
	private String InstallmentRate;     //费率
	
	public InstallmentPlanMsg(String stageNum, String installmentRate) {
		super();
		StageNum = stageNum;
		InstallmentRate = installmentRate;
	}
	
	public InstallmentPlanMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getStageNum() {
		return StageNum;
	}
	public void setStageNum(String stageNum) {
		StageNum = stageNum;
	}
	public String getInstallmentRate() {
		return InstallmentRate;
	}
	public void setInstallmentRate(String installmentRate) {
		InstallmentRate = installmentRate;
	}
}
