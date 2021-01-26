package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DataReaderTest {
    DataReader reader=new DataReader();
    private final static String TEST_DATA = "./src/test/resources/";

    @Test(expected = DataException.class)
    public void testReadDataShouldThrowDataExceptionWhenFileDoesntExist() throws DataException {
        String filename = TEST_DATA + "noFile.txt";

        reader.readData(filename);
    }

    @Test
    public void testReadDataShouldReturnListOfStringsIfFileExistAndHaveData() throws DataException {
        String filename = TEST_DATA + "input.txt";
        String[] expected = new String[]{"1 2 3 5","Good day","5 6 7"};

        List<String> actual =reader.readData(filename);

        Assert.assertArrayEquals(expected, actual.toArray());
    }

    @Test(expected = DataException.class)
    public void testReadDataShouldThrowDataExceptionWhenFileIsEmpty() throws DataException {
        String filename = TEST_DATA + "zero.txt";

        reader.readData(filename);
    }
}
