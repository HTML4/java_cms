package com.mp.entity;

import java.util.Date;

public class AdItem {
    private Integer id;

    private Integer adId;

    private String title;

    private String url;

    private Date createTime;

    private Date updateTime;

    public AdItem(Integer id, Integer adId, String title, String url, Date createTime, Date updateTime) {
        this.id = id;
        this.adId = adId;
        this.title = title;
        this.url = url;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public AdItem() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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