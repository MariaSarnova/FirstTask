package com.epam.task.first.parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayValidator {

    public static final Pattern validElements = Pattern.compile("(-?(0|([1-9][0-9]*)) *)*");

    public boolean validate (String line){
        Matcher validElementsMatcher = validElements.matcher(line);
        return validElementsMatcher.matches();
    }

}
