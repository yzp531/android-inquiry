package com.heinrichreimer.inquiry.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public @interface Column {
    String value() default "";

    boolean unique() default false;
    boolean autoIncrement() default false;
    boolean notNull() default false;
}