package com.galaxy.red.hat.testgoogleguice.request;

import com.galaxy.red.hat.testgoogleguice.services.DrawShape;

import javax.inject.Inject;

public class SquareRequest{
    DrawShape d;

    @Inject
    public SquareRequest(DrawShape d){
        this.d = d;
    }
    public void makeRequest(){
        d.draw();
    }
    public DrawShape getDrawShape(){
        return d;
    }
}