package org.example.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class CalculatorController {
    @GetMapping("/calculator")
    //todo: что такое Model в spring mvc
    //todo: почитать про mvc как патерн
    public String calculate(@RequestParam("a") Integer a,
                          @RequestParam("b") Integer b,
                          @RequestParam("action") String action,
                          Model model) {
        Integer result = 0;
        if (action.equals("*"))
            result = a * b;
        if (action.equals("+"))
            result = a + b;
        if (action.equals("-"))
            result = a - b;
        if (action.equals("/"))
            result = a / b;
        model.addAttribute("resultOfCalculation", result);

        return "first/calculator";
    }
}
