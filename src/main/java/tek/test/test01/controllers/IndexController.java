package tek.test.test01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String home(){
        return "index.html";
    }

    /*
    @GetMapping("/new")
    public String newIndex(){
        return "Diggy diggy";
    }
     */
}
