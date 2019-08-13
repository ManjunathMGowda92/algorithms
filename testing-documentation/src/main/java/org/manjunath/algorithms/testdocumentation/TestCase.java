package org.manjunath.algorithms.testdocumentation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
public @interface TestCase {
	
	public String Author() default "";
	public String testCaseDescription() default "";
	public String expectedResult() default "";
}
