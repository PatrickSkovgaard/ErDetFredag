package com.example.demo.controllers;

import com.example.demo.services.CalculateDay;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DayController {

    CalculateDay calculateDay = new CalculateDay();

    @ResponseBody
    @GetMapping("ErDetFredag")
    public String erDetFredag(){
        return calculateDay.calculateTheDay();
    }

}
