package com.cmos.wuang.chat.dao.model;

import javax.persistence.*;

@Table(name = "friend")
public class Friend {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "chatNum")
    private String chatnum;

    @Column(name = "friendNum")
    private String friendnum;

    @Column(name = "groupId")
    private String groupid;

    @Column(name = "createTime")
    private String createtime;

    @Column(name = "isLink")
    private Integer islink;

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
     * @return friendNum
     */
    public String getFriendnum() {
        return friendnum;
    }

    /**
     * @param friendnum
     */
    public void setFriendnum(String friendnum) {
        this.friendnum = friendnum == null ? null : friendnum.trim();
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
     * @return createTime
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    /**
     * @return isLink
     */
    public Integer getIslink() {
        return islink;
    }

    /**
     * @param islink
     */
    public void setIslink(Integer islink) {
        this.islink = islink;
    }
}