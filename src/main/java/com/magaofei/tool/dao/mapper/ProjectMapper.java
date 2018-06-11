package com.magaofei.tool.dao.mapper;

import com.magaofei.tool.dao.Project;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * 项目映射
 * @author mark
 */
@Mapper
public interface ProjectMapper {

    String TABLE_NAME = "project";

    /**
     * 返回所有项目
     * @param limit
     * @param offset
     * @return Result<Project>
     *
     *         @Results({
     *             @Result(id = true, column = "id", property = "id", javaType = int.class),
     *             @Result(column = "name", property = "name", javaType = String.class),
     *             @Result(column = "email", property = "email", javaType = String.class),
     *             @Result(column = "dingtalkUrl", property = "dingtalk_url", javaType = String.class),
     *             @Result(column = "host", property = "host", javaType = String.class),
     *             @Result(column = "environment", property = "environment", javaType = int.class),
     *             @Result(column = "gmtModified", property = "gmt_modified", javaType = Date.class),
     *     })
     */


    @Select(
            "SELECT id, name, email, dingtalk_url, host, environment, gmt_modified FROM "
            + TABLE_NAME + " WHERE is_deleted = 0 ORDER BY gmt_modified DESC LIMIT #{limit} offset #{offset}")
    List<Project> listProjects(Map<String, Object> map);


    /**
     * 创建项目
     * @param project 项目参数
     * @return id
     */
    @Insert("INSERT INTO " + TABLE_NAME + " (name, email, dingtalk_url, remark, host, proxy, environment, gmt_modified, gmt_create) VALUES " +
            "(#{name}, #{email}, #{dingtalkUrl}, #{remark}, #{host}, #{proxy}, #{environment}, NOW(), NOW() )")
    @Options(useGeneratedKeys = true)
    int saveProject(Project project);


    @Update("UPDATE " + TABLE_NAME + " SET name = #{name}, email = #{email}, dingtalk_url = #{dingtalkUrl}, host = #{host}, " +
            "proxy = #{proxy}, environment = #{environment}, gmt_modified = NOW() WHERE id = #{id}")
    void updateProject(Project project);

    @Update("UPDATE " + TABLE_NAME + " SET is_deleted = 1, gmt_modified = NOW() WHERE id = #{id}")
    void removeProject(Project project);

    /**
     * 获取项目 by id
     * @param id
     * @return
     */
    @Select("SELECT id, name, email, dingtalk_url, host, environment, gmt_modified FROM " + TABLE_NAME +
    "WHERE id = #{id}")
    Project getProjectById(int id);

}
