package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    private static Pattern pattern;
    public boolean firstNameValidation(String firstName)
    {
        pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher=pattern.matcher(firstName);
        if (matcher.matches())
            return true;
        else
            return false;
    }


    public boolean lastNameValidation(String lastName)
    {
        pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher=pattern.matcher(lastName);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean mobileNumberValidation(String s)
    {

        pattern=Pattern.compile("^[0-9]{2}[: :][0-9]{10}$");
        Matcher matcher=pattern.matcher(s);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public Boolean checkEmail(String email)
    {
        pattern=Pattern.compile("^([a-zA-Z0-9]+)([+_,-,.][a-zA-Z0-9]+)?[@][a-zA-Z]+([.][a-z]{2,3})([.]?[a-z]{2})?$");
        Matcher matcher=pattern.matcher(email);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public Boolean userPasswordValidation(String password)
    {
        pattern=Pattern.compile("((?=.*[0-9])(?=.*[a-z]?)(?=.*[A-Z])(?=.*[@#*$%]).{8,})");
        Matcher matcher=pattern.matcher(password);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
