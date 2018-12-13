package com.example.exception;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.controller.ExamController;
import  com.example.exception.RecruitmentManagementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ControllerAdvice
public class RecruitmentException extends ResponseEntityExceptionHandler implements ThrowsAdvice {


	private static final Logger LOGGER = LoggerFactory.getLogger(ExamController.class);

	@AfterThrowing(pointcut = "execution(* com.example.controller.ExamController.*(..))", throwing = "exc")
	public ModelAndView exceptionHandling(JoinPoint jp, Exception exc) throws Throwable {
		System.err.println("Inside CatchThrowException.afterThrowing() method...");
		System.err.println("Running after throwing exception...");
		System.err.println("Exception : " + exc);
		LOGGER.error("Exception Occured " + exc);
		return new ModelAndView("error", "errorMessage", exc);

	}

	@Before("execution(* com.example.bean.Register.*(..))")
	public void logBeforeAllMethods(JoinPoint joinPoint) {
		System.err.println("in before::"+joinPoint.getSignature().getName());
		LOGGER.info(joinPoint.getSignature().getName()+"called");
		LOGGER.trace("Logging :Called " + joinPoint.getSignature().getName());
		//System.out.println("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.example.controller.ExamController.*(..))")
	public void logAfterAllMethods(JoinPoint joinPoint) {

		LOGGER.info(joinPoint.getSignature().getName()+"exiting");
		System.err.println("in after");
		LOGGER.trace("Logging :Closed " + joinPoint.getSignature().getName());
		//System.out.println("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
	}

	/*@ExceptionHandler(value = TicketCounterException.class)
	public ResponseEntity<ExceptionResult> handleMyDataException(TicketCounterException e) {

		LOGGER.error("Checked exception occurred", e);
		ExceptionResult result = new ExceptionResult(e.getCode(), e.getStatus());
		return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);

	}*/
	@ExceptionHandler(value = RecruitmentManagementException.class)
	public String handleMyDataException(RecruitmentManagementException e) {

		LOGGER.error("Checked exception occurred", e);
		new ExceptionResult(e.getCode(), e.getStatus());
		new ExamController();
		System.err.println("Handling Exception");
		//user.error1();
		//return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
		return "redirect:/error1?type="+e.getCode()+"&"+"status="+e.getStatus();
	}
	
	
} 


