package com.brito.mypass.password;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pass")
@RestController
public class Passwordcontroller {
    @Autowired
    private Passwordservice service;

    @GetMapping
    public List<Passwordmodel> getAll(){
        return service.getAll();
    }
}
