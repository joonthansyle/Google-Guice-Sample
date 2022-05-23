package com.galaxy.red.hat.testgoogleguice.services;

import com.galaxy.red.hat.testgoogleguice.annotation.ColorValue;
import com.galaxy.red.hat.testgoogleguice.annotation.RadiusValue;

import javax.inject.Inject;

public class DrawCircleWithAnnotation implements DrawShape{

    private String color;
    private Integer radius;

    @Inject
    public DrawCircleWithAnnotation(@ColorValue String color, @RadiusValue Integer radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of color: "+color+" and radius of: "+radius);
    }
}
