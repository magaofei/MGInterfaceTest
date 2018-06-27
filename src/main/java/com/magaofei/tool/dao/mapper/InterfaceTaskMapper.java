package com.magaofei.tool.dao.mapper;

import com.magaofei.tool.dao.InterfaceTask;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InterfaceTaskMapper {

    List<InterfaceTask> listInterfaceTasks(@Param("limit") int limit, @Param("offset") int offset);

    void saveInterfaceTask();

    void updateInterfaceTaskById();

    void removeInterfaceTask();

}
