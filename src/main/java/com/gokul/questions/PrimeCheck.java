package com.gokul.questions;

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(21));
        System.out.println(isPrime(11));
    }

    public static boolean isPrime(int number){
        if(number==0 && number==1){
            throw new IllegalArgumentException("0 and 1 never can be a prime number");
        }
        if(number==2)
            return true;
        for(int i=2;i<=number/2;i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
}
