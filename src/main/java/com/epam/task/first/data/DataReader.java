package com.epam.task.first.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> readData(String filename) throws DataException{

        try{
            FileInputStream file = new FileInputStream(filename);
            List<String> lines = new ArrayList<String>();
            StringBuilder line = new StringBuilder();
            int currentChar;
            int size=0;

            while((currentChar=file.read())!=-1){
                size++;
                if (currentChar != '\n') {
                    if (currentChar != '\r') {
                        line.append((char) currentChar);
                    }
                } else {
                    lines.add(line.toString());
                    line = new StringBuilder();
                }
            }
            lines.add(line.toString());
            if (size == 0) {
                throw new DataException("File is empty!");
            }
            return lines;

        } catch (FileNotFoundException e) {
            throw new DataException("File not found! " + e.getMessage(), e);
        }catch(IOException e){
            throw new DataException(e.getMessage(),e);
        }
    }

}
