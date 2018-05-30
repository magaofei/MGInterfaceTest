package com.magaofei.tool.repository;

import com.magaofei.tool.dao.Project;

import java.util.List;

/**
 *
 */

public interface ProjectRepository {

    List<Project> getProjectAll ();

    Project getProject(int id);

}
