package org.launchcode.controllers;

import jakarta.validation.Valid;
import org.launchcode.controllers.models.User;
import org.launchcode.data.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.Errors;
@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/add")
    public String displayAddUserForm(Model model){
        model.addAttribute(new User());
        return "user/add";
    }


    @PostMapping("")
    public String processAddUserForm(@ModelAttribute @Valid User user, Errors errors) {

        // add form submission handling code here

        if (errors.hasErrors()) {
            return "user/add";
        } else {
            return "user/index";

        }

    }

        @GetMapping("/details/{id}")
        public  String displayUserDetails(@PathVariable int id,Model model){
            model.addAttribute("user",UserData.getById(id));
             return "/user/details";
        }
}
