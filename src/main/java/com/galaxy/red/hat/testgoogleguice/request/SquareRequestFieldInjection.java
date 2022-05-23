package com.galaxy.red.hat.testgoogleguice.request;

import com.galaxy.red.hat.testgoogleguice.services.DrawShape;

import javax.inject.Inject;

public class SquareRequestFieldInjection {
    @Inject
    DrawShape d;

    public void makeRequest(){
        d.draw();
    }
    public DrawShape getDrawShape(){
        return d;
    }
}