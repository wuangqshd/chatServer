package com.cmos.wuang.chat.dao.model;

import javax.persistence.*;

@Table(name = "chatrecord")
public class ChatRecord {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "sendNum")
    private String sendnum;

    @Column(name = "getNum")
    private String getnum;

    @Column(name = "sendTime")
    private String sendtime;

    @Column(name = "msgId")
    private String msgid;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return sendNum
     */
    public String getSendnum() {
        return sendnum;
    }

    /**
     * @param sendnum
     */
    public void setSendnum(String sendnum) {
        this.sendnum = sendnum == null ? null : sendnum.trim();
    }

    /**
     * @return getNum
     */
    public String getGetnum() {
        return getnum;
    }

    /**
     * @param getnum
     */
    public void setGetnum(String getnum) {
        this.getnum = getnum == null ? null : getnum.trim();
    }

    /**
     * @return sendTime
     */
    public String getSendtime() {
        return sendtime;
    }

    /**
     * @param sendtime
     */
    public void setSendtime(String sendtime) {
        this.sendtime = sendtime == null ? null : sendtime.trim();
    }

    /**
     * @return msgId
     */
    public String getMsgid() {
        return msgid;
    }

    /**
     * @param msgid
     */
    public void setMsgid(String msgid) {
        this.msgid = msgid == null ? null : msgid.trim();
    }
}