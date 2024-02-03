package com.allan.pickfromme.controller;

import com.allan.pickfromme.service.impl.CatFactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatFactController {

    @Autowired
    CatFactServiceImpl catFactService;
    @RequestMapping(value = "/catfact")
    public String  showCatFact() {
        String catFact =  catFactService.getCatFact();
        return catFact;
    }
}
