package com.magaofei.tool.controller;

import com.magaofei.tool.dao.Project;
import com.magaofei.tool.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/project")
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(method = RequestMethod.GET)
    private List<Project> all (@RequestParam int size, @RequestParam int page) {
        return projectService.all(size, page);
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    private Project getProject(@PathVariable int id) {
//        return projectService.getProject(id);
//    }


}
