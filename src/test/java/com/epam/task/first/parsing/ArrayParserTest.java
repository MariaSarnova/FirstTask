package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayParserTest {

    ArrayParser parser = new ArrayParser();

    @Test
    public void testCreateShouldReturnArrayWhenValidStringApplied(){
        String array="4 3 5 7";
        Array expected = new Array(4,3,5,7);

        Array actual=parser.create(array);

        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShouldThrowExceptionWhenWrongStringApplied() {
        String array = "5z 6 y 8";

        Array actual = parser.create(array);
    }

}
