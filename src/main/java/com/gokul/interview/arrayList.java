package com.gokul.interview;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Tesla");
        cars.set(0,"Opel");

        System.out.println(cars);

        Iterator<String>it=cars.iterator();

        while(it.hasNext()){
            String car=it.next();
            if(car.equals("Opel")){
                it.remove();
            }
        }

        for(String i :cars){
            System.out.println(i);
        }

        cars.forEach((car)->{
            System.out.println(car);
        });
    }
}
