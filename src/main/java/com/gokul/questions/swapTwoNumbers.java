package com.gokul.questions;

public class swapTwoNumbers {
    public static void main(String[] args) {
        swap(20,30);
    }
    public static void swap(int a,int b){
        System.out.format("The value before swapping -a: %d b:%d",a,b);
        System.out.println("");
        int c=b+a;
        a=c-a;
        b=c-a;

        System.out.format("value after swapping -a: %d b: %d",a,b);

    }
}
