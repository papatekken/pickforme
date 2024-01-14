package com.allan.pickfromme.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @RequestMapping(value = "/book")
    public String book() {
        return "Hello Book";
    }
}
