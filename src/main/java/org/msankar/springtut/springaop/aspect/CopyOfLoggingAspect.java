package org.msankar.springtut.springaop.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CopyOfLoggingAspect {
	/*
	 * 
	 * aspect. //The following line will run before every getName() is run.
	 * //@Before("execution(public String getName())")
	 * 
	 * //Now if u want it to run only for circle but it wont run for triangle
	 * //@Before(
	 * "execution(public String org.msankar.orderfulfillment.springaop.model.Circle.getName())"
	 * )
	 * 
	 * //Now if u want the advice to be applied to all getters, irrespective of
	 * the return type...Use WILD CARDS //The get method could take 0 or more
	 * arguments. Use .. //For 1 or more arguments use *
	 * //@Before("execution(* get*(..))")
	 * 
	 * @Before("allGetters() && allCircleMethods()") public void LoggingAdvice()
	 * { System.out.println("Advice run. Get method called"); }
	 * 
	 * //This will run when you try to do a SET using the setter.
	 * 
	 * @Before("args(name)") public void stringArgumentMethods(String name) {
	 * System.out.println(
	 * "BEFORE : A method that takes string arguments has been called. ==> " +
	 * name); }
	 * 
	 * //JoinPoint means all the places in ur code where u can apply this
	 * advice.
	 * 
	 * @Before("allCircleMethods()") public void FirstAdvice(JoinPoint
	 * joinPoint) { Circle cir = (Circle) joinPoint.getTarget();
	 * System.out.println("First Advice..Who is calling me......." +
	 * joinPoint.getTarget()); }
	 * 
	 * //Point cuts = Help you avoid repetition of AOP annotations. //All the
	 * points for the execution of ur code where u want this advice method to
	 * cut in. //@Before("execution(* get*(..))")
	 * 
	 * @Before("allGetters()") public void secondAdvice() {
	 * System.out.println("Second Advice executed."); }
	 * 
	 * //Now this pointcut will run for all Circle methods. //Use this for all
	 * logging methods. //@Pointcut(
	 * "execution(* * org.msankar.orderfulfillment.springaop.model.Circle.*(..)"
	 * )
	 * 
	 * //You can do the above another way. The following will run for all circle
	 * methods. //This is more readable. //Within takes the parameter that
	 * describes class //Execution takes the parameter that describes methods.
	 * 
	 * @Pointcut("within(org.msankar.orderfulfillment.springaop.model.Circle)"
	 * ) public void allCircleMethods() {}
	 *//**
	 * After will be run whether the method returns successfully or not.
	 * AfterReturn will only execute if the method returns without any errors.
	 */
	/*
	 * //@After("args(name)")
	 * 
	 * @AfterReturning(pointcut="args(name)", returning="returnString") public
	 * void stringArgumentMethodsAfter(String name, Object returnString) {
	 * System
	 * .out.print("AFTER method that takes string arguments has been called. ==> "
	 * + name +"....."); System.out.println(" The output value is ==> " +
	 * returnString); }
	 * 
	 * @AfterThrowing(pointcut="args(name)", throwing="ex") public void
	 * exceptionAdvice(String name, Throwable ex) {
	 * System.out.println("oops....An exception has been thrown ==> " + ex); }
	 * 
	 * @Pointcut(
	 * "execution(* org.msankar.orderfulfillment.springaop.service.*Service.*(..))"
	 * ) public void allService() {}
	 */

	@Around("allGetters()")
	// @Around("@annotation(org.msankar.orderfulfillment.springaop.aspect.Loggable)")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnObj = null;
		// The proceed method executes the target method the aroundAdvice method
		// is advicing.
		// This way you can decide whether or not the target method gets called.

		try {
			System.out.println("AROUNDADVICE: before around advice");
			returnObj = proceedingJoinPoint.proceed();
			System.out.println("AROUNDADVICE: after around advice");
		} catch (Throwable e) {
			System.out.println("AROUNDADVICE: after throwing in catch block");
		} finally {
			System.out.println("AROUNDADVICE: finally block of around advice");
		}
		return returnObj;
	}

	// You had to type this expr only once and they are used both by
	// LoggingAdvice and secondAdvice.
	@Pointcut("execution(* get*(..))")
	public void allGetters() {
	}

}
