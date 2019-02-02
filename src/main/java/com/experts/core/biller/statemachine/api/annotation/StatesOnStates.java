package com.experts.core.biller.statemachine.api.annotation;


import com.experts.core.biller.statemachine.api.constants.States;
import org.springframework.statemachine.annotation.OnStateChanged;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@OnStateChanged
public @interface StatesOnStates {

    States[] source() default {};

    States[] target() default {};
}
