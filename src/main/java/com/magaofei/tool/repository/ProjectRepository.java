package com.magaofei.tool.repository;

import com.magaofei.tool.dao.Project;
import com.magaofei.tool.dao.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProjectRepository {

    @Autowired
    private ProjectMapper projectMapper;

    public List<Project> getProjectAll(int page, int size) {
        try {
            return projectMapper.all(page, size);
        } catch (NullPointerException e) {
            return new ArrayList<Project>();
        }
    }


    public Project getProject(int id) {
        // TODO
    }
}
