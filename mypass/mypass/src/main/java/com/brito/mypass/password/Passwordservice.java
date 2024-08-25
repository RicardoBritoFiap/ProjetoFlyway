package com.brito.mypass.password;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Passwordservice {
    @Autowired
    private Passwordrepository repository;

    public List<Passwordmodel> getAll(){
        return repository.findAll();
    }
}
