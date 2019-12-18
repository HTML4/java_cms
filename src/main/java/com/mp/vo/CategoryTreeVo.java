package com.mp.vo;

import com.mp.entity.Category;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;
import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CategoryTreeVo {
    private Integer id;

    private Integer parentId;

    private String name;

    private Integer status;

    private Integer contentModel;

    private Integer sort;

    private Date createTime;

    private Date updateTime;

    private List<CategoryTreeVo> children;

    public CategoryTreeVo(Integer id, Integer parentId, String name, Integer status, Integer contentModel, Integer sort, Date createTime, Date updateTime, List<CategoryTreeVo> children) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.status = status;
        this.contentModel = contentModel;
        this.sort = sort;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.children = children;
    }

    public CategoryTreeVo() {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getContentModel() {return contentModel;}

    public void setContentModel(Integer contentModel) {
        this.contentModel = contentModel;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    public List<CategoryTreeVo> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryTreeVo> children) {
        this.children = children;
    }
}
