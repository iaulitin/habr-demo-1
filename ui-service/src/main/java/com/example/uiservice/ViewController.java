package com.example.uiservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class ViewController {

    @GetMapping("hello_view")
    public String helloView() {
        return "hello_view";
    }

    @GetMapping("goodbye_view")
    public String goodbyeView() {
        return "goodbye_view";
    }
}
