package com.galaxy.red.hat.testgoogleguice.mainclasses;

import com.galaxy.red.hat.testgoogleguice.module.SingletonModule;
import com.galaxy.red.hat.testgoogleguice.request.SquareRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemoSingleton {
    private static final String SQUARE_REQ = "SQUARE";
    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);
    }
    private static void sendRequest(String squareReq){
        if(squareReq.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new SingletonModule());
            SquareRequest request1 = injector.getInstance(SquareRequest.class);
            request1.makeRequest();

            SquareRequest request2 = injector.getInstance(SquareRequest.class);
            request2.makeRequest();

            boolean areDrawShapeEqual = request1.getDrawShape() == request2.getDrawShape();
            System.out.println("Were draw shapes equal : "+areDrawShapeEqual);
            boolean areSquareRequestEqual = request1 == request2;
            System.out.println("Were Square Requests equal : "+areSquareRequestEqual);
        }
    }
}
