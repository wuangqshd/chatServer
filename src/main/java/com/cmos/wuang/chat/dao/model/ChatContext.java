package com.cmos.wuang.chat.dao.model;

import javax.persistence.*;

@Table(name = "chatcontext")
public class ChatContext {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "chatContext")
    private String chatcontext;

    private String type;

    private String size;

    private String color;

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
     * @return chatContext
     */
    public String getChatcontext() {
        return chatcontext;
    }

    /**
     * @param chatcontext
     */
    public void setChatcontext(String chatcontext) {
        this.chatcontext = chatcontext == null ? null : chatcontext.trim();
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }
}