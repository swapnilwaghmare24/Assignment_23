package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserValidation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserValidationTest  {
    UserValidation userValidation;
    @Before
    public void initilize()
    {
        userValidation=new UserValidation();
    }
    @Test
    public void firstNameValidation()
    {
        boolean result=userValidation.firstName("Swapnil");
        assertEquals(true,result);
    }
    @Test
    public void lastNameValidation()
    {
        boolean result=userValidation.lastName("Waghmare");
        assertEquals(true,result);
    }
    @Test
    public void emailValidation()
    {
        boolean result=userValidation.email("iamswapnil@gmail.com");
        assertEquals(true,result);
    }
    @Test
    public void mobileNumberValidation()
    {
        boolean result=userValidation.mobileNumber("91-9896989655");
        assertEquals(true,result);
    }
    @Test
    public void passwordValidation()
    {
        boolean result=userValidation.password("Abcd@1234");
        assertEquals(true,result);
    }
}
