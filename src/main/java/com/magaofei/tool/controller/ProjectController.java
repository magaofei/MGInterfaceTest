package com.magaofei.tool.controller;

import com.magaofei.tool.dao.Project;
import com.magaofei.tool.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/project")
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(method = RequestMethod.GET)
    private List<Project> all (@PathVariable int page, @PathVariable int size) {
        return projectService.all(page, size);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private Project getProject(@PathVariable int id) {
        return projectService.getProject(id);
    }

}
