package com.regex;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest
{
    private String string;
    private static UserRegistration userRegistration;
    private boolean expectedResult;

    public EmailValidationTest(String string,boolean expectedResult)
    {
        this.string=string;
        this.expectedResult=expectedResult;
    }

    @BeforeClass
    public static void initialize()
    {
        userRegistration=new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection<Object> emailValidation()
    {
        Object[][] emailValidation=new Object[][]{
                { "abc@yahoo.com" , true },
                {"abc.100@yahoo.com",true},
                {"abc.100@abc.com.au",true},
                {"abc+100@gmail.com",true},
                {"abc.abc@gmail.co.in",true},
                {"abc100@gmail.com",true},
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@g.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@a.com.21a",false},
                {"abc@g.cim.au.au",false}};
        return Arrays.asList(emailValidation);
    }

    @Test
    public void checkEmail_ifValid_ShouldReturnTrue()
    {
        Boolean result=userRegistration.checkEmail(this.string);
        Assert.assertEquals(this.expectedResult,result);
    }
}
