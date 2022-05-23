package com.galaxy.red.hat.testgoogleguice.module;

import com.galaxy.red.hat.testgoogleguice.request.SquareRequest;
import com.galaxy.red.hat.testgoogleguice.request.SquareRequestSubClass;
import com.galaxy.red.hat.testgoogleguice.services.DrawShape;
import com.galaxy.red.hat.testgoogleguice.services.DrawSquare;
import com.google.inject.AbstractModule;

public class SubClassModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
        bind(SquareRequest.class).to(SquareRequestSubClass.class);
    }
}
