package com.example.demo.model;

import com.example.demo.viewer.Viewer;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Model {
    private final Viewer viewer;
    public Model(@Lazy Viewer viewer){
        this.viewer = viewer;
        System.out.println(this);
    }

    public Viewer getViewer() {
        return viewer;
    }
}
