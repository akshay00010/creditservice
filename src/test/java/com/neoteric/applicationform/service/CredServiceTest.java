package com.neoteric.applicationform.service;

import com.neoteric.applicationform.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public  class CredServiceTest {

    @Test
    public void registrationTest(){
 CredService credService= new CredService();
        Customer customer = new Customer();
        Account account= new Account();
        Address address=new Address();
        IFSCcode ifsCcode = new IFSCcode();
        RateOfInterest rateOfInterest = new RateOfInterest();


        Address bankaddress = new Address();

        customer.account = account;
        customer.name = "akshay";
        customer.userId = "23445";
        customer.password = "qwerty";


        account.accountNo = "234456666";
        account.accountType = "savings";
        account.availableBalance = 100000.12;
        account.currentBalance = 100000.12;
        account.address = address;
        account.ifsCcode =ifsCcode;
        account.rateOfInterest = rateOfInterest;


        address.city = "hyderabad";
        address.flatNo = "232";
        address.streetNo ="4";
        address.pinCode = "500080";
        address.state = "telangana";


        ifsCcode.address = bankaddress;
        ifsCcode.ifscCode = "abcd1234";


        rateOfInterest.interestType = "savings";
        rateOfInterest.startDate = new Date();
        rateOfInterest.rateOfInterest = 12;


        bankaddress.flatNo = "56";
        bankaddress.streetNo = "3";
        bankaddress.city = "hyderabad ";
        bankaddress.state = "telangana";
        bankaddress.pinCode = "500080";




       OTP otp =  credService.registration(customer);



    }


}