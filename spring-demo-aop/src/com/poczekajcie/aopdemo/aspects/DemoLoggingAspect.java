package com.poczekajcie.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    //this is where we add all of our related advices for logging

    //@Before advice any class
    //@Before("execution(public void addAccount())")

    //class
    //@Before("execution(public void com.poczekajcie.aopdemo.dao.AccountDAO.addAccount())")

    //any class, any method starts with add
    //@Before("execution(public void add*())")

    //any return type
    @Before("execution(* add*())")
    public void beforeAddAccountAdvice() {
        System.out.println("\n====>>> Executing @Before advice on method");
    }

}
