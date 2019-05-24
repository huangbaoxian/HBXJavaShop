package com.hbx.shop.com.hbx.shop.annotation;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BaseAnnotation {

    String msg() default "msg";



}
