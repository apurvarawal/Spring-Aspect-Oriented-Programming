package com.example.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//This interface is a step of application of "annotation style of configuring advices" inside AOP
@Retention(RetentionPolicy.RUNTIME) //all AOP steps occur in runtime, that's why we have written runtime here.
@Target(ElementType.METHOD) //since we want to control methods, we have written methods here.
public @interface LogAspect {
}
