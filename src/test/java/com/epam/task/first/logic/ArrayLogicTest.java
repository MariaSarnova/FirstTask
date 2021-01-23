package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class ArrayLogicTest {

    private ArrayLogic arrayLogic =new ArrayLogic();

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied(){
        Array array = new Array(1,3,2);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(3,actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied(){
        Array array = new Array(-1,-3,-2);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(-1,actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenIntegerNumbersApplied(){
        Array array = new Array(-10,0,50);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(50,actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied(){
        Array array = new Array(2,5,1);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(1,actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenNegativeNumbersApplied(){
        Array array = new Array(-10,-5,-20);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(-20,actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenIntegerNumbersApplied(){
        Array array = new Array(-10,0,-50);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(-50,actual);
    }

    @Test
    public void replaceNonzeroElementsByOnesWithSignShouldReplaceNonzeroElementsByOnesWhenPositiveNumbersApplied(){
        Array array = new Array(1,2,4,6,20);
        Array expected = new Array(1,1,1,1,1);

        Array actual = arrayLogic.replaceNonzeroElementsByOnesWithSign(array);

        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void replaceNonzeroElementsByOnesWithSignShouldReplaceNonzeroElementsByMinusOnesWhenNegativeNumbersApplied(){
        Array array = new Array(-1,-2,-4,-6,-20);
        Array expected = new Array(-1,-1,-1,-1,-1);

        Array actual = arrayLogic.replaceNonzeroElementsByOnesWithSign(array);

        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void replaceNonzeroElementsByOnesWithSignShouldReplaceNonzeroElementsByMinusOnesWhenIntegerNumbersApplied(){
        Array array = new Array(-1,-2,0,1,1);
        Array expected = new Array(-1,-1,0,1,1);

        Array actual = arrayLogic.replaceNonzeroElementsByOnesWithSign(array);

        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void findTheAverageOfTheElementsShouldFindAverageWhenPositiveNumbersApplied(){
        Array array = new Array(5,3,3,1,1);

        double actual = arrayLogic.findTheAverageOfTheElements(array);

        Assert.assertEquals(2.6,actual,0.001);
    }

    @Test
    public void findTheAverageOfTheElementsShouldFindAverageWhenNegativeNumbersApplied(){
        Array array = new Array(-5,-3,-3,-1,-1);

        double actual = arrayLogic.findTheAverageOfTheElements(array);

        Assert.assertEquals(-2.6,actual,0.001);
    }

    @Test
    public void findTheAverageOfTheElementsShouldFindAverageWhenIntegerNumbersApplied(){
        Array array = new Array(5,-3,0,1,1);

        double actual = arrayLogic.findTheAverageOfTheElements(array);

        Assert.assertEquals(0.8,actual,0.001);
    }

    @Test
    public void findSumShouldFindSumWhenPositiveNumbersApplied(){
        Array array = new Array(5,3,2,1,1);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(12,actual);
    }

    @Test
    public void findSumShouldFindSumWhenNegativeNumbersApplied(){
        Array array = new Array(-5,-3,-2,-1,-1);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(-12,actual);
    }

    @Test
    public void findSumShouldFindSumWhenIntegerNumbersApplied(){
        Array array = new Array(5,3,0,-1,-1);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(6,actual);
    }

    @Test
    public void findAmountOfPositiveElementsShouldfindAmountOfPositiveElementsWhenPositiveNumbersApplied(){
        Array array =new Array(5,6,3,9,6);

        int actual = arrayLogic.findAmountOfPositiveElements(array);

        Assert.assertEquals(5,actual);
    }

    @Test
    public void findAmountOfPositiveElementsShouldfindAmountOfPositiveElementsWhenNegativeNumbersApplied(){
        Array array =new Array(-5,-6,-3,-9);

        int actual = arrayLogic.findAmountOfPositiveElements(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void findAmountOfPositiveElementsShouldfindAmountOfPositiveElementsWhenIntegerNumbersApplied(){
        Array array =new Array(-5,0,-3,9);

        int actual = arrayLogic.findAmountOfPositiveElements(array);

        Assert.assertEquals(1,actual);
    }

    @Test
    public void findAmountOfNegativeElementsShouldfindAmountOfNegativeElementsWhenPositiveNumbersApplied(){
        Array array =new Array(5,6,3,9,6);

        int actual = arrayLogic.findAmountOfNegativeElements(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void findAmountOfNegativeElementsShouldfindAmountOfNegativeElementsWhenNegativeNumbersApplied(){
        Array array =new Array(-5,-6,-3,-9,-6);

        int actual = arrayLogic.findAmountOfNegativeElements(array);

        Assert.assertEquals(5,actual);
    }

    @Test
    public void findAmountOfNegativeElementsShouldfindAmountOfNegativeElementsWhenIntegerNumbersApplied(){
        Array array =new Array(-5,6,0,-9,-6);

        int actual = arrayLogic.findAmountOfNegativeElements(array);

        Assert.assertEquals(3,actual);
    }
}
