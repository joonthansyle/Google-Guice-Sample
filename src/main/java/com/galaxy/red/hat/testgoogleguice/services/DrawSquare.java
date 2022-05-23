package com.galaxy.red.hat.testgoogleguice.services;

public class DrawSquare implements DrawShape{

    @Override
    public void draw() {
        System.out.println("Drawing Square...");
    }
}
