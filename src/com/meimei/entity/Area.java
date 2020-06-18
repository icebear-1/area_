package com.meimei.entity;

public class Area {
    private Integer id;
    private Integer pId;
    private String name;
    private  Integer type;

    public Area(Integer id, Integer pId, String name, Integer type) {
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.type = type;
    }

    public Area() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
