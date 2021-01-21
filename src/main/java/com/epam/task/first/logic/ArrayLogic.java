package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayLogic {

    public int findMax(Array array){
        List<Integer> elements =array.getElements();

        if(elements.size()==0){
            throw new IllegalArgumentException("Array is empty");
        }

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

        if(elements.size()==0){
            throw new IllegalArgumentException("Array is empty");
        }

        int min = elements.get(0);
        for(Integer element : elements){
            if(min>element){
                min=element;
            }
        }

        return min;
    }

    public List<Integer> replaceNonzeroElementsByOnesWithSign(Array array){
        List<Integer> oldElements =array.getElements();

        if(oldElements.size()==0){
            throw new IllegalArgumentException("Array is empty");
        }

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

        return newElements;
    }

    public double findTheAverageOfTheElements(Array array){
        List<Integer> elements =array.getElements();

        if(elements.size()==0){
            throw new IllegalArgumentException("Array is empty");
        }

        double average = 0;
        int sum = 0;
        for(Integer element : elements){
            sum+=element;
        }
        average=(double)sum/elements.size();

        return average;
    }

    public int findSum(Array array){
        List<Integer> elements =array.getElements();

        if(elements.size()==0){
            throw new IllegalArgumentException("Array is empty");
        }

        int sum = 0;
        for(Integer element : elements){
            sum+=element;
        }

        return sum;
    }

    public int findAmountOfPositiveElements(Array array){
        List<Integer> elements =array.getElements();

        if(elements.size()==0){
            throw new IllegalArgumentException("Array is empty");
        }
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

        if(elements.size()==0){
            throw new IllegalArgumentException("Array is empty");
        }
        int amountOfNegative = 0;
        for(Integer element : elements){
            if(element<0){
                amountOfNegative++;
            }
        }

        return amountOfNegative;
    }

}
