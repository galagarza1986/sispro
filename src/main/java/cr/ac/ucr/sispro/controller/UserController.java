package cr.ac.ucr.sispro.controller;

import cr.ac.ucr.sispro.model.User;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public User addUser(@RequestBody User user){
        return new User(1,"lola");
    }

// esto es un comentario de la rama module-user

}
