package com.magaofei.tool.dao.mapper;

import com.magaofei.tool.dao.InterfaceResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InterfaceResultMapper {

    List<InterfaceResult> listInterfaceResults(@Param("limit") int limit, @Param("offset") int offset);

    void saveInterfaceResult(InterfaceResult interfaceResult);
    void updateInterfaceResult(int id);

    InterfaceResult getInterfaceResultById(int id);
//    void removeInterfaceResult(int id);
}
