package com.magaofei.tool.controller;

import com.magaofei.tool.service.InterfaceTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "task")
@RestController
public class InterfaceTaskController {

    private InterfaceTaskService interfaceTaskService;

    @Autowired
    public InterfaceTaskController(InterfaceTaskService interfaceTaskService) {
        this.interfaceTaskService = interfaceTaskService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> listInterfaceTask() {
        return ResponseEntity.ok().body(interfaceTaskService.listInterfaceTask());

    }


}
