package com.example.demo.controller;

import com.example.demo.model.Model;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    private final Model model;
    public Controller(Model model){
        this.model = model;
        System.out.println(this);
    }

    public Model getModel() {
        return model;
    }
}
