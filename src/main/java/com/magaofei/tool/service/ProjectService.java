package com.magaofei.tool.service;

import com.magaofei.tool.dao.Project;

import java.util.List;

public interface ProjectService {

    List<Project> all(int size, int page);

//    Project getProject(int id);
}
