package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    Scanner sc = new Scanner(System.in);
    public UserValidationInterface firstName=firstName->
    {
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher=pattern.matcher(firstName);
        return matcher.matches();
    };
    public UserValidationInterface lastName = lastName->
    {
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher=pattern.matcher(lastName);
       return matcher.matches();
    };

    public UserValidationInterface email = email->
    {
        Pattern pattern=Pattern.compile("^[a-z]+[.]?[a-z]*@[a-z]+.[a-z]+[.a-z]*$");
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();

    };
    public UserValidationInterface mobileNumber = mobileNumber->
    {

        Pattern pattern=Pattern.compile("^[9]{1}[1]{1}-[0-9]{10}$");
        Matcher matcher=pattern.matcher(mobileNumber);
        return matcher.matches();
    };

    public UserValidationInterface password = password->
    {
        Pattern pattern=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&])[a-zA-Z0-9@#$%^&+=]{8,}$");
        Matcher matcher=pattern.matcher(password);
        return matcher.matches();
    };

}
