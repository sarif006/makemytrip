package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bus {

    @GetMapping("/Bus")
    public String getData() {return "Please book your Bus at 25% discount with RedBus" ; }
}
