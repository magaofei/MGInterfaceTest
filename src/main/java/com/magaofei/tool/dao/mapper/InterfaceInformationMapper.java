package com.magaofei.tool.dao.mapper;

import com.magaofei.tool.dao.InterfaceInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface InterfaceInformationMapper {

    String TABLE_NAME = "interface_info";

    @Select("SELECT id, name FROM " + TABLE_NAME + " limit #{limit}, offset #{offset}" )
    List<InterfaceInformation> listInterfaceInfo(Map<String, Object> map);

}
