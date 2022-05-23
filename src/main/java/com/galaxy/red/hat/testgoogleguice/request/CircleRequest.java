package com.galaxy.red.hat.testgoogleguice.request;

import com.galaxy.red.hat.testgoogleguice.services.DrawShape;

import javax.inject.Inject;

public class CircleRequest {
    DrawShape d;

    @Inject
    public CircleRequest(DrawShape d){
        this.d = d;
    }
    public void makeRequest(){
        d.draw();
    }
}