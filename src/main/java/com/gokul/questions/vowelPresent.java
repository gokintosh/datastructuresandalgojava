package com.gokul.questions;

public class vowelPresent {

    public static void main(String[] args) {
        System.out.println(isVowelPresent("gokul"));
        System.out.println(isVowelPresent("TV"));
    }

    public static boolean isVowelPresent(String in){
        return in.toLowerCase().matches(".*[aeiou].*");
    }
}
