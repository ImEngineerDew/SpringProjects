package com.toadsdewin.readlist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController
{

    @GetMapping("/home")
    public String answer(String testing) {
        String a = "This is just";
        String b = "only a test";

        testing = a+" "+b;

        return testing;
    }
}
