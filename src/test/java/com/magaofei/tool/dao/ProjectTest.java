package com.magaofei.tool.dao;

import com.magaofei.tool.dao.mapper.ProjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Project {

    @Autowired
    private ProjectMapper projectMapper;

    @Before
    public void createProject() {
        Project project = new Project();

        projectMapper.create();
    }


    @Test
    public void projectAll() {
        List<Project> projects = projectMapper.all();
        System.out.println(projects);
    }
}
