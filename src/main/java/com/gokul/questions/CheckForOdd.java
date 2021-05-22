package com.gokul.questions;

import java.util.ArrayList;
import java.util.List;

public class CheckForOdd {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);

        System.out.println(isOdd(numbers));
    }

    public static boolean isOdd(List<Integer> list){
//        for(int i:list){
////            if(i%2==0)
////                return false;
////
////        }
////        return true;
//        using parallel streams

        return list.parallelStream().allMatch(x->x%2!=0);
    }
}
