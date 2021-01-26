package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayLogic {

    public int findMax(Array array){
        List<Integer> elements =array.getElements();

        int max = elements.get(0);
        for(Integer element : elements){
            if(max<element){
                max=element;
            }
        }

        return max;
    }

    public int findMin(Array array){
        List<Integer> elements =array.getElements();

        int min = elements.get(0);
        for(Integer element : elements){
            if(min>element){
                min=element;
            }
        }

        return min;
    }

    public Array replaceNonzeroElementsByOnesWithSign(Array array){
        List<Integer> oldElements =array.getElements();

        List<Integer> newElements = new ArrayList<Integer>();
        for(Integer element :oldElements){
            if(element<0){
                newElements.add(-1);
            }

            if(element>0){
                newElements.add(1);
            }

            if(element==0) {
                newElements.add(0);
            }
        }
        Array newArray=new Array(newElements);
        return newArray;
    }

    public double findTheAverageOfTheElements(Array array){
        List<Integer> elements =array.getElements();

        int sum = 0;
        for(Integer element : elements){
            sum+=element;
        }
        double average =(double)sum/elements.size();;

        return average;
    }

    public int findSum(Array array){
        List<Integer> elements =array.getElements();

        int sum = 0;
        for(Integer element : elements){
            sum+=element;
        }

        return sum;
    }

    public int findAmountOfPositiveElements(Array array){
        List<Integer> elements =array.getElements();

        int amountOfPositive = 0;
        for(Integer element : elements){
            if(element>0){
                amountOfPositive++;
            }
        }

        return amountOfPositive;
    }

    public int findAmountOfNegativeElements(Array array){
        List<Integer> elements =array.getElements();

        int amountOfNegative = 0;
        for(Integer element : elements){
            if(element<0){
                amountOfNegative++;
            }
        }

        return amountOfNegative;
    }

}
