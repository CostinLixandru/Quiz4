package com.quiz.Quiz129.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/test")
public class HomeController {



    @GetMapping(path ="/add/first/{first}/second/{second}")
    public String home(@PathVariable int first, @PathVariable int second){

        return first + second + " ";
    }
}
