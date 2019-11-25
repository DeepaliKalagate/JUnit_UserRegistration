package com.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstNameValidationTest
{
    private UserRegistration userRegistration;

    @Test
    public void checkFirstName_ifValid_ShouldReturnTrue()
    {
        System.out.println("Validating First Name of User");
        Assert.assertTrue(userRegistration.firstNameValidation("Deepali"));
    }

    @Before
    public void initializing()
    {
        userRegistration=new UserRegistration();
    }
}
