package com.allan.pickfromme.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatFactController {
    @RequestMapping(value = "/catfact")
    public String getCatFact() {
        return "Cat Fact";
    }
}
