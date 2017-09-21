package com.cmos.wuang.chat.dao.model;

import javax.persistence.*;

@Table(name = "chatuser")
public class Chatuser {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "chatNum")
    private String chatnum;

    @Column(name = "userId")
    private String userid;

    @Column(name = "userName")
    private String username;

    @Column(name = "userPasswd")
    private String userpasswd;

    @Column(name = "userAge")
    private Integer userage;

    @Column(name = "userSex")
    private String usersex;

    @Column(name = "userAddress")
    private String useraddress;

    @Column(name = "userPhone")
    private String userphone;

    @Column(name = "userPic")
    private String userpic;

    @Column(name = "userHome")
    private String userhome;

    @Column(name = "userContext")
    private String usercontext;

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
     * @return userId
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * @return userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return userPasswd
     */
    public String getUserpasswd() {
        return userpasswd;
    }

    /**
     * @param userpasswd
     */
    public void setUserpasswd(String userpasswd) {
        this.userpasswd = userpasswd == null ? null : userpasswd.trim();
    }

    /**
     * @return userAge
     */
    public Integer getUserage() {
        return userage;
    }

    /**
     * @param userage
     */
    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    /**
     * @return userSex
     */
    public String getUsersex() {
        return usersex;
    }

    /**
     * @param usersex
     */
    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    /**
     * @return userAddress
     */
    public String getUseraddress() {
        return useraddress;
    }

    /**
     * @param useraddress
     */
    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    /**
     * @return userPhone
     */
    public String getUserphone() {
        return userphone;
    }

    /**
     * @param userphone
     */
    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    /**
     * @return userPic
     */
    public String getUserpic() {
        return userpic;
    }

    /**
     * @param userpic
     */
    public void setUserpic(String userpic) {
        this.userpic = userpic == null ? null : userpic.trim();
    }

    /**
     * @return userHome
     */
    public String getUserhome() {
        return userhome;
    }

    /**
     * @param userhome
     */
    public void setUserhome(String userhome) {
        this.userhome = userhome == null ? null : userhome.trim();
    }

    /**
     * @return userContext
     */
    public String getUsercontext() {
        return usercontext;
    }

    /**
     * @param usercontext
     */
    public void setUsercontext(String usercontext) {
        this.usercontext = usercontext == null ? null : usercontext.trim();
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