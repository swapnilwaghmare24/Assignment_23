package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserValidation;
import com.bridgelabz.userregistration.UserValidationInterface;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserValidationTest  {
    UserValidation userValidation;
    @Before
    public void init()
    {
        userValidation=new UserValidation();
    }
    @Test
    public void firstNameValidation()
    {
        boolean result=userValidation.firstName.test("Swapnil");
        assertEquals(true,result);
    }
    @Test
    public void lastNameValidation()
    {
        boolean result=userValidation.lastName.test("Waghmare");
        assertEquals(true,result);
    }
    @Test
    public void emailValidation()
    {
        boolean result=userValidation.email.test("iamswapnil@gmail.com");
        assertEquals(true,result);
    }
    @Test
    public void mobileNumberValidation()
    {
        boolean result=userValidation.mobileNumber.test("91-9896989655");
        assertEquals(true,result);
    }
    @Test
    public void passwordValidation()
    {
        boolean result=userValidation.password.test("Abcd@1234");
        assertEquals(true,result);
    }
}
