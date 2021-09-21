package org.fasttrackit.demo02.configuration;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

    @Before("execution(* org.fasttrackit.demo02.service.StudentService.getAllStudents(..))")
    public void serviceMethod() {

        System.out.println("S-a chemat service-ul");
    }
}
