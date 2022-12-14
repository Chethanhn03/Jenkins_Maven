package com.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AppAdvice implements Ordered {
	@Before(value = "execution(* com.dao.sayWelcome.*(..))")
	public void callBefore() {
		System.out.println("applying transaction");
	}	
//		@After(value = "execution(* com.dao.Welcome.sayHello(..))")
//		public void callAfter() {
//			System.out.println("called after sayHello");
//	}

	@Override
	public int getOrder() {
		
		return 2;
	}
	
	
//@Around(value = "execution(* com.dao.Welcome.sayHello(..))")
//public void callAround(ProceedingJoinPoint pj) throws Throwable {
//		System.out.println("called befor sayHello" + pj.getSignature());
//		pj.proceed();
//		System.out.println("called after sayHello");
//	}
	
	

}
