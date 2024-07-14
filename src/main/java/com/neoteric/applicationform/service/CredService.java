package com.neoteric.applicationform.service;

import com.neoteric.applicationform.Customer;
import com.neoteric.applicationform.OTP;

import java.util.UUID;

public class CredService {

    public OTP registration(Customer customer){


        OTP otp=new OTP();
        otp.userId = "akshay";
        otp.expiryTime = "30sec";
        otp.accountNo = "234567";
        otp.mobileNumber = "234567775454";


      /*  if (customer.account.accountNo.equals(otp.accountNo)) {
            otp.accountNo = UUID.randomUUID().toString();
            System.out.println("otp generated successfully " + otp.otp);
        }else {
            System.out.println("otp not generated");
        }*/
        return otp;








    }

}
