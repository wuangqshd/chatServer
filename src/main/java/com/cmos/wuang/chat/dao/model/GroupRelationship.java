package com.cmos.wuang.chat.dao.model;

import javax.persistence.*;

@Table(name = "grouprelationship")
public class GroupRelationship {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "groupId")
    private String groupid;

    @Column(name = "chatNum")
    private String chatnum;

    @Column(name = "addTime")
    private String addtime;

    @Column(name = "groupViewName")
    private String groupviewname;

    @Column(name = "isNoSay")
    private Integer isnosay;

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
     * @return groupId
     */
    public String getGroupid() {
        return groupid;
    }

    /**
     * @param groupid
     */
    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
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
     * @return addTime
     */
    public String getAddtime() {
        return addtime;
    }

    /**
     * @param addtime
     */
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    /**
     * @return groupViewName
     */
    public String getGroupviewname() {
        return groupviewname;
    }

    /**
     * @param groupviewname
     */
    public void setGroupviewname(String groupviewname) {
        this.groupviewname = groupviewname == null ? null : groupviewname.trim();
    }

    /**
     * @return isNoSay
     */
    public Integer getIsnosay() {
        return isnosay;
    }

    /**
     * @param isnosay
     */
    public void setIsnosay(Integer isnosay) {
        this.isnosay = isnosay;
    }
}