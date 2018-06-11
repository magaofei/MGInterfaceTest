//package com.magaofei.tool.repository;
//
//import com.github.pagehelper.Page;
//import com.github.pagehelper.PageHelper;
//import com.magaofei.tool.dao.Project;
//import com.magaofei.tool.dao.mapper.ProjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//@Repository
//public class ProjectRepository {
//
//    @Autowired
//    private ProjectMapper projectMapper;
//
////    public List<Project> getProjectAll(int limit, int offset) {
//////        Map<String, Object> data = new HashMap<>();
//////        data.put("limit", limit);
//////        data.put("offset", offset);
//////        return projectMapper.all(data);
////
////        return projectMapper.all(limit, offset);
//////        Page<Project> page = PageHelper.startPage(offset, limit);
////
////    }
//
//
//    public List<Project> getProjects(int page, int size) {
//        return projectMapper.getProjectsAll(size, page);
//    }
//
//
////    public Project getProject(int id) {
////        // TODO
////    }
//}
