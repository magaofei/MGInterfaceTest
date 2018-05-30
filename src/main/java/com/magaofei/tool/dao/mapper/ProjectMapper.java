package com.magaofei.tool.dao.mapper;

import com.magaofei.tool.dao.Project;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 项目映射
 * @author mark
 */
@Mapper
public interface ProjectMapper {

    String TABLE_NAME = "project";

    /**
     * 返回所有项目
     * @return Result<Project>
     */
    @Select("SELECT id, name, email, dingtalk_url, host, environment, gmt_modified FROM "
            + TABLE_NAME + " WHERE is_deleted = 0 ORDER BY gmt_modified DESC")
    /**
    @Results({
            @Result(id = true, column = "id", property = "id", javaType = int.class),
            @Result(column = "name", property = "name", javaType = String.class),
            @Result(column = "email", property = "email", javaType = String.class),
            @Result(column = "dingtalkUrl", property = "dingtalk_url", javaType = String.class),
            @Result(column = "host", property = "host", javaType = String.class),
            @Result(column = "environment", property = "environment", javaType = int.class),
            @Result(column = "gmtModified", property = "gmt_modified", javaType = Date.class),
    })
     */
    List<Project> all();

    /**
     * 创建项目
     * @param project 项目参数
     */
    @Insert("INSERT INTO " + TABLE_NAME + " (name, email, dingtalk_url, remark, host, proxy, environment) VALUES " +
            "(#{name}, #{email}, #{dingtalkUrl}, #{remark}, #{host}, #{proxy}, #{environment} )")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int create(Project project) throws Exception;

}
