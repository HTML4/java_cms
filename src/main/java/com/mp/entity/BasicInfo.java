package com.mp.entity;

public class BasicInfo {
    private Integer id;

    private String name;

    private String logo;

    private String icon;

    private String title;

    private String desc;

    private String keyWords;

    private String copyright;

    public BasicInfo(Integer id, String name, String logo, String icon, String title, String desc, String keyWords, String copyright) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.icon = icon;
        this.title = title;
        this.desc = desc;
        this.keyWords = keyWords;
        this.copyright = copyright;
    }

    public BasicInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords == null ? null : keyWords.trim();
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright == null ? null : copyright.trim();
    }
}