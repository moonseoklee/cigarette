package com.example.cigarettesmakeshower.Controller;



import com.example.cigarettesmakeshower.Dao.SomeDao;
import com.example.cigarettesmakeshower.Model.SomeModel;
import com.example.cigarettesmakeshower.Service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    SomeService someService;

    @GetMapping("/")
    public ModelAndView Home(){

        ModelAndView mv = new ModelAndView("home");



        return mv;
    }

    @GetMapping("/test")
    public ModelAndView Test(Model model){
        ModelAndView mv = new ModelAndView("test");



        model.addAttribute("id", someService.getSome());

        return mv;
    }

    @PostMapping("/test")
    public void PostTest(@RequestBody SomeModel some){


        someService.insertSome(some.getTitle(),some.getPrice());
    }
}
