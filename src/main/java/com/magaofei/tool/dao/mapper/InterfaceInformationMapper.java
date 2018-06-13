package com.magaofei.tool.dao.mapper;

import com.magaofei.tool.dao.InterfaceInformation;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Mapper
public interface InterfaceInformationMapper {

    String TABLE_NAME = "interface_info";

    @Select("SELECT id, name, interface_case_id, category_id, url, method, params, headers, sort, gmt_create, gmt_modified FROM " +
            TABLE_NAME + " limit #{limit}, offset #{offset}" )
    List<InterfaceInformation> listInterfaceInfo(Map<String, Object> map);


    @Select("SELECT id, name, interface_case_id, category_id, url, method, params, headers, sort, gmt_create, gmt_modified FROM " +
            TABLE_NAME + " WHERE id = #{id}" )
    InterfaceInformation getInterfaceInformationById(int id);

    @Insert("INSERT INTO name, interface_case_id, category_id, url, method, params, headers, sort, gmt_create, gmt_modified FROM " +
            TABLE_NAME)
    @Options(useGeneratedKeys = true)
    void saveInterfaceInformation(InterfaceInformation interfaceInformation);

    @Update("<script>" +
            "UPDATE " + TABLE_NAME + " <SET> " +
            "<if test='name != null'>name = #{name}, </if> " +
            "<if test='interface_case_id != null'>interface_case_id = #{interfaceCaseId}, </if> " +
            "<if test='category_id != null'>category_id = #{categoryId}, </if> " +
            "<if test='url != url'>url = #{url}, </if> " +
            "<if test='method != method'>method = #{method}, </if> " +
            "<if test='params != params'>params = #{params}, </if> " +
            "<if test='headers != headers'>headers = #{headers}, </if> " +
            "<if test='sort != sort'>sort = #{sort}, </if> " +
            "<set>" +
            "WHERE id = #{id}" +
            "</script>"
    )
    void updateInterfaceInformation(InterfaceInformation interfaceInformation);

    @Update("UPDATE " + TABLE_NAME + " SET is_deleted = #{deleted}")
    void removeInterfaceInformaton(InterfaceInformation interfaceInformation);

}
