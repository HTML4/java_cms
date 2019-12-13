package com.mp.entity;

import java.util.Date;

public class Comment {
    private Integer id;

    private Integer parentId;

    private Integer userId;

    private Integer artcleId;

    private Integer status;

    private String detail;

    private Date createTime;

    private Date updateTime;

    public Comment(Integer id, Integer parentId, Integer userId, Integer artcleId, Integer status, String detail, Date createTime, Date updateTime) {
        this.id = id;
        this.parentId = parentId;
        this.userId = userId;
        this.artcleId = artcleId;
        this.status = status;
        this.detail = detail;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Comment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArtcleId() {
        return artcleId;
    }

    public void setArtcleId(Integer artcleId) {
        this.artcleId = artcleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
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