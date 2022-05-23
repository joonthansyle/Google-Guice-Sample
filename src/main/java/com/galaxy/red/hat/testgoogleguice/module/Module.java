package com.galaxy.red.hat.testgoogleguice.module;

import com.galaxy.red.hat.testgoogleguice.services.DrawShape;
import com.galaxy.red.hat.testgoogleguice.services.DrawSquare;
import com.google.inject.AbstractModule;

public class Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
    }
}
