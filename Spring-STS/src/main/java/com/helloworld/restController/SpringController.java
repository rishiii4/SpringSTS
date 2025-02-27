package com.helloworld.restController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {
    // Display "Hello from BridgeLabz"
    @GetMapping()
    public String hello(){
        return "index";
    }

    // Display "Hello from BridgeLabz" in a Web Page
    @GetMapping("/web")
    public String sayHello(){
        return "web";
    }


}
