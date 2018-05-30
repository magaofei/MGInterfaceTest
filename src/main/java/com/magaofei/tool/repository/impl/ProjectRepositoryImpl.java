package com.magaofei.tool.repository.impl;

import com.magaofei.tool.dao.Project;
import com.magaofei.tool.dao.mapper.ProjectMapper;
import com.magaofei.tool.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProjectRepositoryImpl implements ProjectRepository {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> getProjectAll() {
        try {
            return projectMapper.all();
        } catch (NullPointerException e) {
            return new ArrayList<Project>();
        }
    }

    @Override
    public Project getProject() {
        // TODO
    }
}
