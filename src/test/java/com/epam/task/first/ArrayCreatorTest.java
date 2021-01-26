package com.epam.task.first;

import com.epam.task.first.ArrayCreator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.parsing.ArrayValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> TEST_DATA= Arrays.asList("1 2 3","3g 4 6","7 8 9","88 9 7");

    @Test
    public void testProcessShouldReturnListOfArraysWhenAllStringsAreCorrect() throws DataException {
        DataReader reader= Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(TEST_DATA.get(0))).thenReturn(true);
        when(validator.validate(TEST_DATA.get(1))).thenReturn(false);
        when(validator.validate(TEST_DATA.get(2))).thenReturn(true);
        when(validator.validate(TEST_DATA.get(3))).thenReturn(true);

        ArrayParser parser = Mockito.mock(ArrayParser.class);
        when(parser.create(TEST_DATA.get(0))).thenReturn(new Array(1, 2, 3));
        when(parser.create(TEST_DATA.get(2))).thenReturn(new Array(7, 8, 9));
        when(parser.create(TEST_DATA.get(3))).thenReturn(new Array(88,9,7));

        ArrayCreator creator = new ArrayCreator(reader, validator, parser);
        String expected=new Array(1, 2, 3).toString() + new Array(7, 8, 9).toString()+new Array(88,9,7);

        List<Array> actualArray = creator.process("filename");
        String actual =actualArray.get(0).toString() + actualArray.get(1).toString()+actualArray.get(2);

        Assert.assertEquals(expected,actual);

    }

}
