package com.example.libreria;


import com.example.libreria.model.Users;
import com.example.libreria.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private UsersRepo usersRepo;

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }
    @GetMapping("/main")
    public String main(Map<String, Object> model){

        Iterable<Users> user=usersRepo.findAll();
        model.put("names", user);
        return "main.mustache";
    }
    @PostMapping("/main")
    public String add(@RequestParam String username, @RequestParam String password, Map<String, Object> model){
        Users user=new Users(username, password);
        usersRepo.save(user);
        Iterable<Users> users=usersRepo.findAll();
        model.put("names", users);
        return "main.mustache";
    }
  /*  @GetMapping("/all")
    public String showAll(Model model) {
        model.addAttribute("users", usersRepo.findAll());
        return "main.mustache";
    }*/

}