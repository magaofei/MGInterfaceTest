package com.magaofei.tool.entity.mapper;

import com.magaofei.tool.entity.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 项目映射
 */
@Mapper
public interface ProjectMapper {

    String TABLE_NAME = "project";

    @Select("SELECT id, name, email, dingtalkUrl, host, environment, gmtModified FROM" + TABLE_NAME + "WHERE is_deleted != 0 ORDER BY gmtModified DESC")
    List<Project> all();


}
