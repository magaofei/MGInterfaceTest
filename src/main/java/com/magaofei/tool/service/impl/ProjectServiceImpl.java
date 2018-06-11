package com.magaofei.tool.service.impl;

import com.magaofei.tool.dao.Project;
import com.magaofei.tool.dao.mapper.ProjectMapper;
import com.magaofei.tool.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectServiceImpl implements ProjectService {

//    @Autowired
//    private ProjectRepository projectRepository;

    @Autowired
    private ProjectMapper projectMapper;


    @Override
    public List<Project> listProjects(int size, int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("limit", size);
        data.put("offset", page);
        return projectMapper.listProjects(data);
    }


//    @Override
//    public Project getProject (int id) {return this.projectRepository.getProject()};
}
