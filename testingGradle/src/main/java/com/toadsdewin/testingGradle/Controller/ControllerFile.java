package com.toadsdewin.testingGradle.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ControllerFile
{
    @GetMapping(path= "answer")
    public ResponseEntity<String> getMessage()
    {
        System.out.println("Hello world!");
        return ResponseEntity.status(HttpStatus.OK).body("Hello world!");
    }
}