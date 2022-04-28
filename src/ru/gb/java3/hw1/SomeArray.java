package ru.gb.java3.hw1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomeArray<T> {

    public void changeIndex(T[] array,int ind1,int ind2) {

        T a = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = a;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public List<T> toArrayList(T[] array){

        return new ArrayList<>(Arrays.asList(array));
    }

}



