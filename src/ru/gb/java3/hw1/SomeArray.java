package ru.gb.java3.hw1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomeArray<T> {

    public void changeIndex(T[] obj,int ind1,int ind2) {

        T a = obj[ind1];
        obj[ind1] = obj[ind2];
        obj[ind1] = a;

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

    }
    public List<T> toArrayList(T[] array){

        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String[] s = {"1", "2"};
        Integer[] i = {1, 3};
        Double[] d = {1.2, 3.1};
        SomeArray array = new SomeArray();
        array.changeIndex(s,1,2);
        array.changeIndex(i,1,2);
        array.changeIndex(d,1,2);
        System.out.println(array.toArrayList(s).getClass().getName());

    }


}



