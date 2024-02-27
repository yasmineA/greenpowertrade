package org.agregiosolution.greenpowertrade.application.api;

import org.agregiosolution.greenpowertrade.domain.services.OfferService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Map;

import static org.mockito.Mockito.when;


@SpringBootTest
@AutoConfigureMockMvc
class OfferControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OfferService offerService;

    @Test
    public void testGetOffers() throws Exception {
        //todo implement test
        when(offerService.getOffers()).thenReturn(Map.of());
        mockMvc.perform(MockMvcRequestBuilders.get("/offer")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}