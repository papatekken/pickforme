package com.allan.pickforme.service;

import com.allan.pickforme.service.impl.CatFactServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static com.allan.pickforme.constant.PickForMeConstants.CAT_FACT_SERVICE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CatFactServiceImplTest {
    @InjectMocks CatFactServiceImpl catFactServiceImpl = new CatFactServiceImpl();

    @Mock
    private RestTemplate restTemplate;

    @Test
    void callCatFactServiceReturnDescription() {
        String expectedReturn = "Sample Cat Fact";
        Mockito.when(restTemplate.getForObject(CAT_FACT_SERVICE_URL, String.class))
               .thenReturn(expectedReturn);
        String fact = catFactServiceImpl.fetchCatFact();
        System.out.println(fact);
        assertEquals(fact, expectedReturn);
    }
}
