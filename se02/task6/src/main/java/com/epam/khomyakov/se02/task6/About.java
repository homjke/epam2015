package com.epam.khomyakov.se02.task6;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface About {
	    String author() default "Khomyakov_Artyom";
	    String date();
	    int revision() default 1;
	    String comments();
	    
	


}
