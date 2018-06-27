package com.magaofei.tool.controller;

import com.magaofei.tool.dao.InterfaceResult;
import com.magaofei.tool.dao.Page;
import com.magaofei.tool.service.InterfaceResultService;
import com.magaofei.tool.util.BindingErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author mark
 */
@RequestMapping(value = "/interfaceResult")
@RestController
public class InterfaceResultController {

    private InterfaceResultService interfaceResultService;

    @Autowired
    InterfaceResultController(InterfaceResultService interfaceResultService) {
        this.interfaceResultService = interfaceResultService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> listInterfaceResult(@Valid Page page, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body(BindingErrors.errors(bindingResult));
        }

        return ResponseEntity.ok().body(interfaceResultService.listInterfaceResults(page.getSize(), page.getStart()));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> saveInterfaceResult(@Valid InterfaceResult interfaceResult, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body(BindingErrors.errors(bindingResult));
        }
        interfaceResultService.saveInterfaceResult(interfaceResult);
        return ResponseEntity.ok().body(interfaceResult);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getInterfaceResult(@PathVariable Integer id) {
        System.out.println("id==" + id);
        if (null == id) {
            return ResponseEntity.badRequest().body("id == null");
        }

        return ResponseEntity.ok().body(interfaceResultService.getInterfaceResultById(id));
    }
}
