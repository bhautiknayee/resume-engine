package com.jobfit.resume_engine.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/resume-engine/test")
public class TestController {

   @GetMapping("/test")
    public String test(){
       return "OK.";
    }

}
