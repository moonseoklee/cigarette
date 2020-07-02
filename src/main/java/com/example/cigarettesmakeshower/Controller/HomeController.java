package com.example.cigarettesmakeshower.Controller;


import com.example.cigarettesmakeshower.Model.SomeModel;
import com.example.cigarettesmakeshower.Service.SomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView Home(){

        ModelAndView mv = new ModelAndView("home");
        SomeModel board = SomeService.printSomething();

        return mv;
    }


}
