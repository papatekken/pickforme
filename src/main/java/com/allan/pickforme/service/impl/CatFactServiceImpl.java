package com.allan.pickforme.service.impl;

import com.allan.pickforme.service.CatFactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.allan.pickforme.constant.PickForMeConstants.CAT_FACT_SERVICE_URL;

@Service
public class CatFactServiceImpl implements CatFactService {

    @Autowired
    private RestTemplate restTemplate;
    public String fetchCatFact() {
        String catFact =  restTemplate.getForObject(CAT_FACT_SERVICE_URL, String.class);
        return catFact;
    }
}
