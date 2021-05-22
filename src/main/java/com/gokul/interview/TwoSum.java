package com.gokul.interview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers=new int[]{2,3,7,8,10};
        int target=11;
        int[] answer=getTwoSum(numbers,target);
        System.out.println(answer[0]+" "+answer[1]);
    }

    public static int[] getTwoSum(int[] numbers,int target){
        Map<Integer,Integer>numbersItr=new HashMap<Integer, Integer>();

        for(int i=0;i<numbers.length;i++){
            int delta=target-numbers[i];

            if(numbersItr.containsKey(delta)){
                return new int[]{i,numbersItr.get(delta)};
            }

            numbersItr.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }
}
