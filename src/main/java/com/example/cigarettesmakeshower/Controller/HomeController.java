package com.example.cigarettesmakeshower.Controller;



import com.example.cigarettesmakeshower.Dao.SomeDao;
import com.example.cigarettesmakeshower.Model.SomeModel;
import com.example.cigarettesmakeshower.Service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    SomeService someService;

    @GetMapping("/")
    public ModelAndView Home(Model model){

        ModelAndView mv = new ModelAndView("home");

        model.addAttribute("some",someService.getSome());

        return mv;
    }

    @GetMapping("/test")
    public ModelAndView Test(Model model){
        ModelAndView mv = new ModelAndView("test");


        model.addAttribute("id", someService.getSome());

        return mv;
    }

    @PostMapping("/submitSome")
    public ModelAndView PostTest(@RequestParam("file") MultipartFile file, SomeModel some, HttpServletRequest request) throws IOException {

        ModelAndView mv = new ModelAndView("home");



        String filePath ="../../resources/static/images/"+file.getOriginalFilename();
        file.transferTo(new File(filePath));

        someService.insertSome(some.getTitle(),some.getPrice());

        return mv;
    }
}
