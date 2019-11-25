package com.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MobileNumberValidationTest
{
    private UserRegistration userRegistration;
    @Test
    public void CheckMobileNumber_ifValid_ShouldReturnTrue()
    {
        System.out.println("Validating Mobile Number");
        Assert.assertTrue(userRegistration.mobileNumberValidation("91 8412989861"));
    }

    @Before
    public void initializing()
    {
       userRegistration=new UserRegistration();
    }
}
