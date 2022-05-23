package com.galaxy.red.hat.testgoogleguice.request;

import com.galaxy.red.hat.testgoogleguice.services.DrawShape;

import javax.inject.Inject;

public class SquareRequestSubClass extends SquareRequest{
    @Inject
    public SquareRequestSubClass(DrawShape d) {
        super(d);
    }

    @Override
    public void makeRequest() {
        System.out.println("FROM SQUARE REQUEST SUB CLASS");
        super.makeRequest();
    }
}
