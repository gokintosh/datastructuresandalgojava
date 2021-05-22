package com.gokul.questions;

public class FibonacciRecursion {

    public static void main(String[] args) {

        System.out.println( printFibonacci(30));

    }

//    public static void printFibonacci(int n){
//        int a=0;
//        int b=1;
//        int c=1;
//
//        for(int i=0;i<=n;i++){
//            System.out.println(i+" "+a+" ,");
//            a=b;
//            b=c;
//            c=a+b;
//        }
//    }

    public static int printFibonacci(int number){
        if(number<=1)
            return number;
        return printFibonacci(number-1)+printFibonacci(number-2);
    }
}
