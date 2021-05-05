package com.example.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy= {IsMatchEnumsValueValidator.class})
@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsMatchEnumsValue {

	String enumParam();
	String age();
	
	String message() default "Doesn't match your Education to your age.";
	Class<?>[] groups() default{};
	Class<? extends Payload>[]  payload() default{};
}
