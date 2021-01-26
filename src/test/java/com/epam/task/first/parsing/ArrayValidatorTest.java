package com.epam.task.first.parsing;

import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    private ArrayValidator validator=new ArrayValidator();

    @Test
    public void testValidateShouldReturnTrueWhenCorrectStringWithPositiveNumbersApplied(){
        String array="3 5 6";

        boolean actual=validator.validate(array);

        Assert.assertTrue(actual);
    }


    @Test
    public void testValidateShouldReturnTrueWhenCorrectStringWithNegativeNumbersApplied(){
        String array="-3 -5 -6";

        boolean actual=validator.validate(array);

        Assert.assertTrue(actual);
    }


    @Test
    public void testValidateShouldReturnTrueWhenCorrectStringWithIntegerNumbersApplied(){
        String array="-3 -5 -6 0 5 6";

        boolean actual=validator.validate(array);

        Assert.assertTrue(actual);
    }


    @Test
    public void testValidateShouldReturnFalseWhenWrongStringApplied(){
        String array="-3z -5 -6k 0 5 6";

        boolean actual=validator.validate(array);

        Assert.assertFalse(actual);
    }

}
