package com.magaofei.tool.controller;

import com.magaofei.tool.dao.Page;
import com.magaofei.tool.dao.Project;
import com.magaofei.tool.service.ProjectService;
import com.magaofei.tool.util.BindingErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mark
 * https://blog.csdn.net/xavierqwb/article/details/62418901
 */
@RequestMapping(value = "/project")
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<?> listProjects (@Valid Page page, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body(BindingErrors.errors(bindingResult));
        }
        List<Project> projects = projectService.listProjects(page.getSize(), page.getStart());
        Map<String, Object> map = new HashMap<>();
        map.put("start", page.getStart());
        map.put("size", page.getSize());
        map.put("data", projects);
        return ResponseEntity.ok().body(map);
    }


    @RequestMapping(method = RequestMethod.POST)
    private ResponseEntity<?> saveProject(@Valid  Project project, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body(BindingErrors.errors(bindingResult));
        }


        projectService.saveProject(project);
        return ResponseEntity.ok().body(project);

        /**
         *
        URI location = null;

        try {
            location = new URI("http://www.example.com/project/" + project.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }        return ResponseEntity.created(location).body(project);

         */


    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private ResponseEntity<?> getProject(@PathVariable int id) {
        Project project = projectService.getProject(id);
        if (project == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(project);
    }

//    @RequestMapping(method = RequestMethod.PUT)
//    private RequestEntity updateProject(Project project) {
//
//        return ResponseEntity.ok().body();
//    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    private Project getProject(@PathVariable int id) {
//        return projectService.getProject(id);
//    }


}
