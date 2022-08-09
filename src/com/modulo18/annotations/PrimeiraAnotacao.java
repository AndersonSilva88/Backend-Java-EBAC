package com.modulo18.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface PrimeiraAnotacao {
    String value();

    String[] bairros();

    long numeroCasa();

    double valores() default 10.0;
}
