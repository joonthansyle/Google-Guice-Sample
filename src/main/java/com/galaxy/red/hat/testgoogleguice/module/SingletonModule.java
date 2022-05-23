package com.galaxy.red.hat.testgoogleguice.module;

import com.galaxy.red.hat.testgoogleguice.request.SquareRequest;
import com.galaxy.red.hat.testgoogleguice.services.DrawShape;
import com.galaxy.red.hat.testgoogleguice.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class SingletonModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
        bind(SquareRequest.class).in(Scopes.SINGLETON);
    }
}
