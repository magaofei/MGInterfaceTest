package com.magaofei.tool.dao.mapper;

import com.magaofei.tool.dao.InterfaceTask;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InterfaceTaskMapper {

    List<InterfaceTask> listInterfaceTasks();

}
