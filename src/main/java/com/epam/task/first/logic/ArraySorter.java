package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArraySorter {

    public Array bubbleSort(Array array){
        List<Integer> elements = array.getElements();
        int size = elements.size();

        for(int i=0;i<size-1;i++){
            for(int j=size-1;j>i;j--){
                if(elements.get(j-1)>elements.get(j)){
                    int tmp = elements.get(j-1);
                    elements.set(j-1,elements.get(j)) ;
                    elements.set(j,tmp);
                }
            }
        }
        return new Array(elements);

    }


    public Array shellSort(Array array){
        List<Integer> elements = array.getElements();
        int size = elements.size();
        int gap = size/2;

        while(gap>=1){
            for(int i=0;i<size;i++){
                for(int j=i-gap;j>=0;j-=gap){
                    if(elements.get(j)>elements.get(j+gap)){
                        int tmp = elements.get(j);
                        elements.set(j,elements.get(j+gap)) ;
                        elements.set(j+gap,tmp);
                    }
                }
            }
            gap=gap/2;
        }
        return new Array(elements);
    }

    public Array insertionSort(Array array) {
        List<Integer> elements = array.getElements();
        int size = elements.size();

        for (int i = 1; i < size; i++) {
            int current = elements.get(i);
            int j = i - 1;
            while(j >= 0 && current < elements.get(j)) {
                elements.set(j+1,elements.get(j));
                j--;
            }
            elements.set(j+1,current);
        }
        return new Array(elements);
    }
}
