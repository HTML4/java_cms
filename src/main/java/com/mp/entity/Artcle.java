package com.mp.entity;

import java.util.Date;

public class Artcle {
    private Integer id;

    private Integer categoryId;

    private String author;

    private String title;

    private String desc;

    private String thumbnail;

    private String content;

    private Boolean status;

    private Date createTime;

    private Date updateTime;

    public Artcle(Integer id, Integer categoryId, String author, String title, String desc, String thumbnail, String content, Boolean status, Date createTime, Date updateTime) {
        this.id = id;
        this.categoryId = categoryId;
        this.author = author;
        this.title = title;
        this.desc = desc;
        this.thumbnail = thumbnail;
        this.content = content;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Artcle() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}