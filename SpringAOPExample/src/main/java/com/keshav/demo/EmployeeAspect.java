package com.keshav.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	@Before("execution(public * com.keshav.demo.MyController.findAll())")
	public void input()
	{
		System.out.println("some input operation.....");
	}
}
