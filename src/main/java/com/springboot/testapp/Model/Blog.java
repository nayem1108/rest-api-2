package com.springboot.testapp.Model;

import lombok.Data;

@Data
public class Blog {
    private int id;
    private String title;
    private String description;

    public Blog(int id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
    }
    
}
