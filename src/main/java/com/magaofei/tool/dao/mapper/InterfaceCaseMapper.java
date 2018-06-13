package com.magaofei.tool.dao.mapper;

import com.magaofei.tool.dao.InterfaceCase;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface InterfaceCaseMapper {

    String TABLE_NAME = "interface_case";

    @Select("SELECT id, name, project_id, config_id, level, remark, status, gmt_create, gmt_modified FROM " + TABLE_NAME +
            " limit #{limit}, offset #{offset}")
    @Results({
            @Result(property = "projectId", column = "project_id"),
            @Result(property = "configId", column = "config_id"),
            @Result(property = "gmtCreate", column = "gmt_create"),
            @Result(property = "gmtModified", column = "gmt_modified"),
    })
    List<InterfaceCase> listInterfaceCase(Map<String, Object> map);

    /**
     * 查找接口用例
     * @param interfaceCase
     * @return
     */
    @Select("SELECT id, name, project_id, config_id, level, remark, status, gmt_create, gmt_modified FROM " + TABLE_NAME +
        " WHERE id = #{id}")
    @Results({
            @Result(property = "projectId", column = "project_id"),
            @Result(property = "configId", column = "config_id"),
            @Result(property = "gmtCreate", column = "gmt_create"),
            @Result(property = "gmtModified", column = "gmt_modified"),
    })
    InterfaceCase getInterfaceCaseById(InterfaceCase interfaceCase);

    /**
     * 保存接口用例
     * @param interfaceCase
     */
    @Insert("INSERT INTO name, project_id, config_id, level, remark, status, gmt_create, gmt_modified FROM " + TABLE_NAME +
    " VALUES ( #{name}, #{projectId}, #{configId}, #{level}, #{remark}, #{status}, NOW(), NOW() )")
    void saveInterfaceCase(InterfaceCase interfaceCase);

    @Update("UPDATE " + TABLE_NAME + " SET name = #{name}, project_id = #{projectId} config_id = #{configId} level = #{level}, remark = #{remark} " +
            "status = #{status} gmt_modified = NOW() WHERE id = #{id}" )
    void updateInterfaceCase(InterfaceCase interfaceCase);


}
