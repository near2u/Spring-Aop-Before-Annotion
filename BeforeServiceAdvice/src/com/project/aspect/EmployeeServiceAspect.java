package com.project.aspect;

import javax.xml.ws.soap.Addressing;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.scheduling.annotation.Async;

@Aspect
public class EmployeeServiceAspect {

	
	@After(value = "execution(* com.project.service.*.getEmpName())")
	public void beforeAdvice(){
		System.out.println("After Advice....");
	}
}
