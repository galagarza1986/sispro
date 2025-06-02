package cr.ac.ucr.sispro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sispro")
public class UserController {

    @GetMapping
    public String saludo(){
        return "Hola mundo";
    }

}
