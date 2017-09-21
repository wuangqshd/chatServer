package com.cmos.wuang.chat.dao.model;

import javax.persistence.*;

@Table(name = "grouping")
public class Grouping {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "chatNum")
    private String chatnum;

    @Column(name = "createTime")
    private String createtime;

    @Column(name = "groupName")
    private String groupname;

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
     * @return groupName
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * @param groupname
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }
}