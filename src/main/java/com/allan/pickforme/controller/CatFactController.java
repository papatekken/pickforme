package com.allan.pickforme.controller;

import com.allan.pickforme.service.impl.CatFactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatFactController {

    @Autowired
    CatFactServiceImpl catFactService;
    @RequestMapping(value = "/catfact")
    public String  showCatFact() {
        String catFact =  catFactService.fetchCatFact();
        return catFact;
    }
}
