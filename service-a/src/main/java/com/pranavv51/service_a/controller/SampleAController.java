package com.pranavv51.service_a.controller;

import com.pranavv51.service_a.service.SampleAService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleAController {

    private final SampleAService sampleAService;

    public SampleAController(SampleAService sampleAService) {
        this.sampleAService = sampleAService;
    }

    @GetMapping(value = "/get-message")
    public String getRandomMessage(){
        return sampleAService.genString();
    }
}
