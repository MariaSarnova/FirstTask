package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    private final List<Integer> elements;

    public Array(Integer... elements){
        this.elements=new ArrayList<Integer>();
        this.elements.addAll(Arrays.asList(elements));
    }

    public Array(List<Integer> elements){
        this.elements=elements;
    }

    public List<Integer> getElements(){
        return elements;
    }


    public boolean equals(Array array) {
        List<Integer> thisArray=this.getElements();
        List<Integer> newArray=array.getElements();

        int thisSize= thisArray.size();
        int newSize= newArray.size();

        if(thisSize!=newSize){
            return false;
        }
        for(int i=0;i<thisSize;i++){
            if(!thisArray.get(i).equals(newArray.get(i))){
                return false;
            }
        }
        return true;
    }

}
