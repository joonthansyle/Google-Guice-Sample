package com.galaxy.red.hat.testgoogleguice.request;

import com.galaxy.red.hat.testgoogleguice.services.DrawShape;

import javax.inject.Inject;

public class SquareRequestMethodInjector {
    DrawShape d;

    public void makeRequest(){
        d.draw();
    }

    @Inject
    public void setD(DrawShape d) {
        this.d = d;
    }

    public DrawShape getDrawShape(){
        return d;
    }
}