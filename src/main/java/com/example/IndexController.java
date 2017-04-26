package com.example;

/**
 * Created by sim_l on 25/04/2017.
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}