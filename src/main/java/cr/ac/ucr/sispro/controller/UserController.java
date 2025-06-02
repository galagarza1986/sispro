package cr.ac.ucr.sispro.controller;

import cr.ac.ucr.sispro.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sispro")
public class UserController {

    @GetMapping
    public String saludo(){
        return "Hola mundo";
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return new User(1,"Lola");
    }

}
