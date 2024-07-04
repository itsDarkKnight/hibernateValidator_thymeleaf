package com.example.validation.Validationdemo.Controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class validationController {

    @GetMapping("/form")
    public String openform(Model model)
    {
        model.addAttribute("logindata",new Logindata());
        return "loginform";
    }
    @PostMapping("/process")
    public String processdata(@Valid @ModelAttribute("logindata") Logindata logindata, BindingResult result)
    {
        if(result.hasErrors()) {
            System.out.println(result);
            return "loginform";
        }

        System.out.println(logindata);
        return "success";
    }
}
