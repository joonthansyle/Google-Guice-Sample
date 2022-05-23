package com.galaxy.red.hat.testgoogleguice.module;

import com.galaxy.red.hat.testgoogleguice.annotation.ColorValue;
import com.galaxy.red.hat.testgoogleguice.annotation.RadiusValue;
import com.galaxy.red.hat.testgoogleguice.services.DrawCircleWithAnnotation;
import com.galaxy.red.hat.testgoogleguice.services.DrawShape;
import com.google.inject.AbstractModule;

public class ConstantAnnotationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawCircleWithAnnotation.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Blue");
        bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(50);
    }
}
