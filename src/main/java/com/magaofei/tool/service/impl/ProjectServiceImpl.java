package com.magaofei.tool.service.impl;

import com.magaofei.tool.dao.Project;
import com.magaofei.tool.repository.ProjectRepository;
import com.magaofei.tool.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    @Override
    public List<Project> all(int size, int page) {
        return this.projectRepository.getProjectAll(size, page);
    }

//    @Override
//    public Project getProject (int id) {return this.projectRepository.getProject()};
}
