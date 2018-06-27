package com.magaofei.tool.controller;

import com.magaofei.tool.dao.Page;
import com.magaofei.tool.service.InterfaceTaskService;
import com.magaofei.tool.util.BindingErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping(value = "task")
@RestController
public class InterfaceTaskController {

    private InterfaceTaskService interfaceTaskService;

    @Autowired
    public InterfaceTaskController(InterfaceTaskService interfaceTaskService) {
        this.interfaceTaskService = interfaceTaskService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> listInterfaceTask(@Valid Page page, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body(BindingErrors.errors(bindingResult));
        }

        return ResponseEntity.ok().body(interfaceTaskService.listInterfaceTask(page.getSize(), page.getStart()));

    }


}
