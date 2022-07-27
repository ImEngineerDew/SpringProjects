package com.toadsdewin.tacocloud.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    /*This is a getMapping test*/
    @GetMapping("/sum")
    public String sum(Integer a, Integer b, Integer result)
    {
        a= 12;
        b= 18;
        result = a+b;

        return "The sum is equals to: "+result;
    }
}
