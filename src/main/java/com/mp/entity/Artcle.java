package com.mp.entity;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Artcle {
    private Integer id;

    private Integer categoryId;

    private String author;

    private String title;

    private String description;

    private String thumbnail;

    private String content;

    private Integer contentModel;

    private Integer status;

    private Integer pageViews;

    private Date createTime;

    private Date updateTime;

    public Artcle(Integer id, Integer categoryId, String author, String title, String description, String thumbnail, String content, Integer contentModel, Integer status, Integer pageViews, Date createTime, Date updateTime) {
        this.id = id;
        this.categoryId = categoryId;
        this.author = author;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.content = content;
        this.contentModel = contentModel;
        this.status = status;
        this.pageViews = pageViews;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Integer getContentModel() {
        return contentModel;
    }

    public void setContentModel(Integer contentModel) {
        this.contentModel = contentModel;
    }

    public Integer getStatus() { return status; }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPageViews() {
        return pageViews;
    }

    public void setPageViews(Integer pageViews) {
        this.pageViews = pageViews;
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