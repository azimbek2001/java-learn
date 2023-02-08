package com.example.demo.viewer;

import com.example.demo.controller.Controller;
import org.springframework.stereotype.Component;

@Component
public class Viewer {
    private final Controller controller;
    public Viewer(Controller controller){
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }
}
