package com.regex;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordValidationTest
{
    private String argument;
    private static UserRegistration userRegistration;
    private boolean expectedValidation;

    public PasswordValidationTest(String argument, boolean expectedValidation)
    {
        this.argument = argument;
        this.expectedValidation = expectedValidation;
    }
    @BeforeClass
    public static void initialize()
    {
        userRegistration=new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][]{
                {"Password@123",true},
                {"#passWord1",true},
                {"Pass%1234",true},
                {"PaASS1212%",true},
                {"1234*5678Aa",true},
                {"Pa1ss2word#",true},
                {"PASSword",false},
                {"Password123",false},
                {"#passWord",false},
                {"Pass1234",false},
                {"pa12",false},
                {"PaASS1212",false},
                {"12345678Aa",false},
                {"Pa1ss2word",false}};

        return Arrays.asList(data);
    }
     @Test
    public void givePassword_IfValid_ShouldReturnTrue()
    {
        Boolean result = userRegistration.userPasswordValidation(this.argument);
        Assert.assertEquals(this.expectedValidation, result);
    }
}