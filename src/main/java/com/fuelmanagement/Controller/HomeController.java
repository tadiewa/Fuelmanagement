package com.fuelmanagement.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "this is Home page";
    }

    @GetMapping("/admin")
    public String  admin(){
        return "this is Admin page";
    }

    @GetMapping("/index")
    public String login(){
        return "index";
    }

}
