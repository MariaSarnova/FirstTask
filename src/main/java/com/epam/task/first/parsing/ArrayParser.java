package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;


public class ArrayParser {

    public Array create(String data){
        List<Integer> elements = new ArrayList<Integer>();

        StringBuilder number = new StringBuilder();
        int size=data.length();
        for (int i = 0; i < size; i++) {
            char digit = data.charAt(i);
            if (digit != ' ') {
                number.append(digit);
            } else {
                if (number.length() != 0) {
                    int finiteNumber = new Integer(number.toString());
                    elements.add(finiteNumber);
                }
                number = new StringBuilder();
            }
        }
        if (number.length() != 0) {
            int lastNumber = new Integer(number.toString());
            elements.add(lastNumber);
        }
        return new Array(elements);
    }

}
