package com.cmos.wuang.chat.dao.model;

import javax.persistence.*;

@Table(name = "loginrecord")
public class LoginRecord {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "chatNum")
    private String chatnum;

    @Column(name = "loginIp")
    private String loginip;

    @Column(name = "loginPort")
    private String loginport;

    @Column(name = "loginTime")
    private String logintime;

    @Column(name = "isOnline")
    private Integer isonline;

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
     * @return chatNum
     */
    public String getChatnum() {
        return chatnum;
    }

    /**
     * @param chatnum
     */
    public void setChatnum(String chatnum) {
        this.chatnum = chatnum == null ? null : chatnum.trim();
    }

    /**
     * @return loginIp
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * @param loginip
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    /**
     * @return loginPort
     */
    public String getLoginport() {
        return loginport;
    }

    /**
     * @param loginport
     */
    public void setLoginport(String loginport) {
        this.loginport = loginport == null ? null : loginport.trim();
    }

    /**
     * @return loginTime
     */
    public String getLogintime() {
        return logintime;
    }

    /**
     * @param logintime
     */
    public void setLogintime(String logintime) {
        this.logintime = logintime == null ? null : logintime.trim();
    }

    /**
     * @return isOnline
     */
    public Integer getIsonline() {
        return isonline;
    }

    /**
     * @param isonline
     */
    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }
}