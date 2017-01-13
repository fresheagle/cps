package cn.com.hrbb.cps.model;

public class InstallmentrateModel {
    private Integer rateserial;

    private String installmentplancode;

    private String installmenttypecode;

    private String stagenum;

    private String installmentrate;

    public Integer getRateserial() {
        return rateserial;
    }

    public void setRateserial(Integer rateserial) {
        this.rateserial = rateserial;
    }

    public String getInstallmentplancode() {
        return installmentplancode;
    }

    public void setInstallmentplancode(String installmentplancode) {
        this.installmentplancode = installmentplancode == null ? null : installmentplancode.trim();
    }

    public String getInstallmenttypecode() {
        return installmenttypecode;
    }

    public void setInstallmenttypecode(String installmenttypecode) {
        this.installmenttypecode = installmenttypecode == null ? null : installmenttypecode.trim();
    }

    public String getStagenum() {
        return stagenum;
    }

    public void setStagenum(String stagenum) {
        this.stagenum = stagenum == null ? null : stagenum.trim();
    }

    public String getInstallmentrate() {
        return installmentrate;
    }

    public void setInstallmentrate(String installmentrate) {
        this.installmentrate = installmentrate == null ? null : installmentrate.trim();
    }
}