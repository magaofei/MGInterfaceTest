package com.magaofei.tool.dao;

/**
 *
 */
public enum Deleted {

    /**
     *  已删除
     */
    DELETED("已删除", 0),

    /**
     *  未删除
     */
    NOT_DELETED("未删除", 1);

    private String name;

    Deleted(String name, int index) {
        this.name = name;
        this.index = index;
    }

    private int index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }



}
