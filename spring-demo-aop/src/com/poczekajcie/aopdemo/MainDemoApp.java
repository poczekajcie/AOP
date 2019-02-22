package com.poczekajcie.aopdemo;

import com.poczekajcie.aopdemo.dao.AccountDAO;
import com.poczekajcie.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        //get the beans from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        //call the methods
        accountDAO.addAccount();
        membershipDAO.addAccount();

        //close the context
        context.close();

    }

}
