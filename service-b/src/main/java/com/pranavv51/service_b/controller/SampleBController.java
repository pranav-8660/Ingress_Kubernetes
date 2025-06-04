package com.pranavv51.service_b.controller;


import com.pranavv51.service_b.service.SampleBService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleBController {

    private final SampleBService sampleBService;


    public SampleBController(SampleBService sampleBService) {
        this.sampleBService = sampleBService;
    }

    @GetMapping(value = "/get-string")
    public String getSeqString(){
        return sampleBService.generateSeqStrings();
    }

}
