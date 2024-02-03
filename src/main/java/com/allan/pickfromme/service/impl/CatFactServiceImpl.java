package com.allan.pickfromme.service.impl;

import com.allan.pickfromme.service.CatFactService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CatFactServiceImpl implements CatFactService {
    public String getCatFact() {
        String uri = "https://catfact.ninja/fact";
        RestTemplate restTemplate = new RestTemplate();
        String catFact =  restTemplate.getForObject(uri, String.class);
        return catFact;
    }
}
