package com.projrct2.practice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    //http://localhost:8080/api/message
    @GetMapping("/message")
    public String message(){
        return "Hello world gfcgfcgcgf";
    }
}
