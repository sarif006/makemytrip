package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights {

    @GetMapping("/flights")
    public String getData() {return "Please book your flight at 10% discount from SpiceJet" ; }
}
