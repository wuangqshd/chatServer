package com.cmos.wuang.chat.dao.model;

import javax.persistence.*;

@Table(name = "group")
public class Group {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "groupNum")
    private String groupnum;

    @Column(name = "createNum")
    private String createnum;

    @Column(name = "createTime")
    private String createtime;

    @Column(name = "groupName")
    private String groupname;

    @Column(name = "groupPic")
    private String grouppic;

    @Column(name = "groupContext")
    private String groupcontext;

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
     * @return groupNum
     */
    public String getGroupnum() {
        return groupnum;
    }

    /**
     * @param groupnum
     */
    public void setGroupnum(String groupnum) {
        this.groupnum = groupnum == null ? null : groupnum.trim();
    }

    /**
     * @return createNum
     */
    public String getCreatenum() {
        return createnum;
    }

    /**
     * @param createnum
     */
    public void setCreatenum(String createnum) {
        this.createnum = createnum == null ? null : createnum.trim();
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

    /**
     * @return groupPic
     */
    public String getGrouppic() {
        return grouppic;
    }

    /**
     * @param grouppic
     */
    public void setGrouppic(String grouppic) {
        this.grouppic = grouppic == null ? null : grouppic.trim();
    }

    /**
     * @return groupContext
     */
    public String getGroupcontext() {
        return groupcontext;
    }

    /**
     * @param groupcontext
     */
    public void setGroupcontext(String groupcontext) {
        this.groupcontext = groupcontext == null ? null : groupcontext.trim();
    }
}