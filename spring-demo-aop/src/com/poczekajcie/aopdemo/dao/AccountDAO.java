package com.poczekajcie.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAcoount() {
        System.out.println(getClass() + "DOING MY DB WORK: ADDING ACCOUNT");
    }

}
