/**
 * ���ڼƻ���ϸӳ����
 * @author zm
 * @time 20161010
 */

package cn.com.hrbb.cps.SFQ01.bean;

public class InstallmentPlanMsg {
	private String StageNum;            //����
	private String InstallmentRate;     //����
	
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
