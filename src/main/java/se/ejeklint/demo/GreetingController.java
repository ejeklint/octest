package se.ejeklint.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String rootGreeting() {
        return "Root-saker äro goda!";
    }
    
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "Värld") String name) {
        return name + "!";
    }
}
