package com.magaofei.tool.controller;

import com.magaofei.tool.dao.Page;
import com.magaofei.tool.dao.Project;
import com.magaofei.tool.service.ProjectService;
import com.magaofei.tool.util.BindingErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
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
            List<String> errorMessage = new ArrayList<>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                errorMessage.add(fieldError.getField() + " " + fieldError.getObjectName() + " " + fieldError.getDefaultMessage());
            }

            return ResponseEntity.badRequest().body(errorMessage);
        }


        int projectId = projectService.saveProject(project);
        URI location = null;

        try {
            location = new URI("http://www.example.com/project/" + projectId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.created(location).build();

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
