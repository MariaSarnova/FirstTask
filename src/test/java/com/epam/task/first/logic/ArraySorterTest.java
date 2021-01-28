package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {

    private ArraySorter arraySorter =new ArraySorter();
    private final static Array EXPECTED_ARRAY = new Array(-3,1,2,4,8);

    @Test
    public void testBubbleSortShouldSortArrayInAscendingOrderWhenIntegerNumbersApplied(){
        Array array = new Array(1,-3,2,8,4);

        Array actual = arraySorter.bubbleSort(array);

        Assert.assertEquals(EXPECTED_ARRAY,actual);

    }

    @Test
    public void testShellSortShouldSortArrayInAscendingOrderWhenIntegerNumbersApplied(){
        Array array = new Array(1,-3,2,8,4);

        Array actual = arraySorter.shellSort(array);

        Assert.assertEquals(EXPECTED_ARRAY,actual);

    }


    @Test
    public void testInsertionSortShouldSortArrayInAscendingOrderWhenIntegerNumbersApplied(){
        Array array = new Array(1,-3,2,8,4);

        Array actual = arraySorter.insertionSort(array);

        Assert.assertEquals(EXPECTED_ARRAY,actual);

    }

}
