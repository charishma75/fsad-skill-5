package com.example;

import org.springframework.stereotype.Component;

@Component   // tells Spring to create object automatically
public class Certification {

    private int id;
    private String name;
    private String dateOfCompletion;

    public Certification() {
        this.id = 101;
        this.name = "Java Spring";
        this.dateOfCompletion = "2026-03-17";
    }

    public void display() {
        System.out.println("Certification ID: " + id);
        System.out.println("Certification Name: " + name);
        System.out.println("Completion Date: " + dateOfCompletion);
    }
}