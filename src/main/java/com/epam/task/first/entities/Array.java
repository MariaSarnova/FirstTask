package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (Integer element : elements) {
            result.append(element).append(", ");
        }
        result.append("]");
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Objects.equals(elements, array.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }
}
