package com.med.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Annotate the class with the @Controller stereotype annotation
public class HomeController {

    @RequestMapping("/home") //User @RequestMapping annotation to associate the action with an HTTP request path
    public String home() {
        return "home.html"; //Retrun the HTML file name that contains the details we want the browser to display
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome.html";
    }

    @RequestMapping
    public String home3() {
        return "home.html";
    }


}
