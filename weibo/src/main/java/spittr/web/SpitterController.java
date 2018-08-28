package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.Spitter;
import spittr.Spittle;
import spittr.data.SpitterRepository;

import javax.validation.Valid;
import java.util.List;

/**
 * created by liuxv on 2018/7/23
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;



    @Autowired
    public SpitterController(SpitterRepository spitterRepository){
        this.spitterRepository=spitterRepository;
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String showRegistrationForm(){
        return "registerForm";
    }


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors){
        if(errors.hasErrors()){
            return "registerForm";
        }

        spitterRepository.save( spitter );
        return "redirect:/spitter/"+spitter.getUsername();
    }


    @RequestMapping(value = "/{username}",method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable("username") String username, Model model){
        System.out.println( username );
       // Spitter spitter=spitterRepository.findByUsername( username );
       // System.out.println( spitter.getUsername() );
        model.addAttribute(spitterRepository.findByUsername( username ));
        return "profile";
    }








}
