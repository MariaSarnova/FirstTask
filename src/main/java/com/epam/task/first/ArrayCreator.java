package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.parsing.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private DataReader dataReader;
    private ArrayValidator validator;
    private ArrayParser parser;

    public ArrayCreator(final DataReader dataReader, final ArrayValidator validator, final ArrayParser parser){
        this.dataReader=dataReader;
        this.validator=validator;
        this.parser=parser;

    }


    public List<Array> process(String filename){
        try {
            //read Lines from file
            List<String> lines = dataReader.readData(filename);
            List<Array> validArrays = new ArrayList<Array>();
            for (String line : lines) {
                //validate each line
                boolean isArray = validator.validate(line);
                if (isArray) {
                    //for each valid line create array
                    Array array = parser.create(line);
                    validArrays.add(array);
                }
            }
            //return result
            return validArrays;
        }catch (DataException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

}
