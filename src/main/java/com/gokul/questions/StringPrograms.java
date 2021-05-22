package com.gokul.questions;

public class StringPrograms {
    public static void main(String[] args) {
        String str="gokul";
        System.out.println(reverse(str));


    }
    public static String reverse(String in){
        if(in==null){
            throw new IllegalArgumentException("null cannot be a valid string input");
        }

        StringBuilder out=new StringBuilder();

        char[] stringAsChars=in.toCharArray();
        for(int i=in.length()-1;i>=0;i--){
            out.append(stringAsChars[i]);
        }
        return out.toString();

    }

}
