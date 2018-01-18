package com.magaofei.tool.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class ToolController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index () {
        return "Hello, World";
    }



}
