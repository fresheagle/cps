package xfesco.itmanager.model;

public class TradelogModel {
    private Integer logid;

    private String tradecode;

    private String tradeserial;

    private String channelcode;

    private String content;

    private String requesttime;

    private String responetime;

    private String reasoncode;

    private String remark1;

    private String remark2;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getTradecode() {
        return tradecode;
    }

    public void setTradecode(String tradecode) {
        this.tradecode = tradecode == null ? null : tradecode.trim();
    }

    public String getTradeserial() {
        return tradeserial;
    }

    public void setTradeserial(String tradeserial) {
        this.tradeserial = tradeserial == null ? null : tradeserial.trim();
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode == null ? null : channelcode.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRequesttime() {
        return requesttime;
    }

    public void setRequesttime(String requesttime) {
        this.requesttime = requesttime == null ? null : requesttime.trim();
    }

    public String getResponetime() {
        return responetime;
    }

    public void setResponetime(String responetime) {
        this.responetime = responetime == null ? null : responetime.trim();
    }

    public String getReasoncode() {
        return reasoncode;
    }

    public void setReasoncode(String reasoncode) {
        this.reasoncode = reasoncode == null ? null : reasoncode.trim();
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