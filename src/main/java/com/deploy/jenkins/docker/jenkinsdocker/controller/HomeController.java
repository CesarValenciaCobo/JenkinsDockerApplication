package com.deploy.jenkins.docker.jenkinsdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController{

    @GetMapping("/vi/hello")
    public String hello(){
        return "deploying from jenkins to docker";
    }
}
