package com.pream.applicationLearn.controllers;

import com.pream.applicationLearn.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String madeJoke(Model model){
        model.addAttribute("joke", jokeService.makeJoke());

        return "chucknorris";
    }
}
