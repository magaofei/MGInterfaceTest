package com.magaofei.tool.dao.mapper;

import com.magaofei.tool.dao.InterfaceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface InterfaceInfoMapper {

    String TABLE_NAME = "interface_info";

    @Select("SELECT id, name FROM " + TABLE_NAME + " limit #{limit}, offset #{offset}" )
    List<InterfaceInfo> listInterfaceInfo(Map<String, Object> map);

}
