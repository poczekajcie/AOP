package com.poczekajcie.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    /*public void addMember() {
        System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
    }*/

    public boolean addSillyMember() {
        System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
        return false;
    }

}
