package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
public class UserController  {

@GetMapping("/")
public String get(Model model)
{
    model.addAttribute( "user",new User());
    return "login";
}

@Autowired
 private UserRepository repository;


@PostMapping("/login")

public String login(@ModelAttribute("User")User user  , Model model, HttpSession session, BindingResult bindingResult){
         if (bindingResult.hasErrors()) {
             model.addAttribute("user", user);
            return "login";
         }
    User user1= repository.findByNomAndPassword(user.getNom(),user.getPassword()) ;
    if (user1 == null) {

        model.addAttribute("error","name or password is not valid") ;
        model.addAttribute("user", user);
        return "login" ;
    }
    else {
        session.setAttribute("nom" , user.getNom());
        return "accueil" ;

    }
    }

   @RequestMapping(value = "logout" ,method= RequestMethod.GET)
    public String logout(HttpSession session)
    {
      session.removeAttribute("nom");
        return "redirect:/";
    }

}




