package com.galaxy.red.hat.testgoogleguice.mainclasses;

import com.galaxy.red.hat.testgoogleguice.module.ConstantAnnotationModule;
import com.galaxy.red.hat.testgoogleguice.request.CircleRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemoConstantAnnotation {
    private static final String SQUARE_REQ = "SQUARE";
    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);
    }
    private static void sendRequest(String squareReq){
        if(squareReq.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new ConstantAnnotationModule());
            CircleRequest request = injector.getInstance(CircleRequest.class);
            request.makeRequest();
        }
    }

}
