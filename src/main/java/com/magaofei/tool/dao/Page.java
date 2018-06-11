package com.magaofei.tool.dao;

import javax.validation.constraints.NotNull;

public class Page {


    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @NotNull(message = "缺少起始")
    private Integer start;

    @NotNull(message = "缺少size")
    private Integer size;
}
