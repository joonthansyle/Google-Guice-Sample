package com.galaxy.red.hat.testgoogleguice.module;

import com.galaxy.red.hat.testgoogleguice.services.DrawCircle;
import com.galaxy.red.hat.testgoogleguice.services.DrawShape;
import com.google.inject.AbstractModule;

public class ConstantModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawCircle.class);
        bind(String.class).toInstance("Blue");
        bind(Integer.class).toInstance(50);
    }
}
