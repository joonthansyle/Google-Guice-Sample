package com.galaxy.red.hat.testgoogleguice.services;

import javax.inject.Inject;

public class DrawCircle implements DrawShape{

    private String color;
    private Integer radius;

    @Inject
    public DrawCircle(String color, Integer radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of color: "+color+" and radius of: "+radius);
    }
}
