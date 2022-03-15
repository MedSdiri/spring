package com.med.conrtoller;


import com.med.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudents());

        return "student/register";
    }


}
