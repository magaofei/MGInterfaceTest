package com.magaofei.tool.dao;


/**
 * 接口用例信息与接口标签的多对多关系
 */
public class InterfaceInfoTags {

    private int interfaceInfoId;
    private int interfaceTagsId;

    public int getInterfaceInfoId() {
        return interfaceInfoId;
    }

    public void setInterfaceInfoId(int interfaceInfoId) {
        this.interfaceInfoId = interfaceInfoId;
    }

    public int getInterfaceTagsId() {
        return interfaceTagsId;
    }

    public void setInterfaceTagsId(int interfaceTagsId) {
        this.interfaceTagsId = interfaceTagsId;
    }

    public InterfaceInfoTags () {

    }


    public InterfaceInfoTags(int interfaceInfoId, int interfaceTagsId) {
        this.interfaceInfoId = interfaceInfoId;
        this.interfaceTagsId = interfaceTagsId;
    }
}
