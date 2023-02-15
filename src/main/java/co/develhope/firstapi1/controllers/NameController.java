package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NameController {

    @GetMapping("/")
    public String getName() {
        return "Michele";
    }

    @PostMapping("/")
    public String postName() {
        StringBuilder builder = new StringBuilder();
        String name = "Michele";

        for (int i = name.length() - 1; i >= 0; i--) {
            builder.append(name.charAt(i));
        }
        return builder.toString();
    }
}