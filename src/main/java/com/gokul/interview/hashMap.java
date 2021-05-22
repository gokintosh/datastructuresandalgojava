package com.gokul.interview;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities=new HashMap<String,String>();

        capitalCities.put("England","London");
        capitalCities.put("India","Delhi");
        capitalCities.put("Poland","Warsaw");
        capitalCities.put("USA","washington");

        System.out.println(capitalCities);


        for(String i:capitalCities.keySet()){
            System.out.println(i);
        }

        System.out.println("has the following capitals");

        for(String i:capitalCities.values()){
            System.out.println(i);
        }
    }
}
