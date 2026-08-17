package com.indeed.server.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobseeker")
public class JobSeekerController {
    @GetMapping("/dashboard")
    public String dashboard() {
        return "Welcome Job Seeker";
    }
}
