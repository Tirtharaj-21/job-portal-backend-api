package com.indeed.server.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
    @GetMapping("/dashboard")
    public String dashboard() {
        return "Welcome Recruiter";
    }
}
