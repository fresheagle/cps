package cn.com.hrbb.cps.model;

public class InstallmentplanModel {
    private Integer installmentserial;

    private String installmentcode;

    private String installmenttype;

    private String installmentdes;

    private String dimensiontypecode;

    private String dimensionparameter;

    private String createdate;

    private String userid;

    private String remark1;

    private String remark2;

    public Integer getInstallmentserial() {
        return installmentserial;
    }

    public void setInstallmentserial(Integer installmentserial) {
        this.installmentserial = installmentserial;
    }

    public String getInstallmentcode() {
        return installmentcode;
    }

    public void setInstallmentcode(String installmentcode) {
        this.installmentcode = installmentcode == null ? null : installmentcode.trim();
    }

    public String getInstallmenttype() {
        return installmenttype;
    }

    public void setInstallmenttype(String installmenttype) {
        this.installmenttype = installmenttype == null ? null : installmenttype.trim();
    }

    public String getInstallmentdes() {
        return installmentdes;
    }

    public void setInstallmentdes(String installmentdes) {
        this.installmentdes = installmentdes == null ? null : installmentdes.trim();
    }

    public String getDimensiontypecode() {
        return dimensiontypecode;
    }

    public void setDimensiontypecode(String dimensiontypecode) {
        this.dimensiontypecode = dimensiontypecode == null ? null : dimensiontypecode.trim();
    }

    public String getDimensionparameter() {
        return dimensionparameter;
    }

    public void setDimensionparameter(String dimensionparameter) {
        this.dimensionparameter = dimensionparameter == null ? null : dimensionparameter.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
}