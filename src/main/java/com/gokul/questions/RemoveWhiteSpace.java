package com.gokul.questions;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        System.out.println(removeWhitespace("gokul is a nice boy"));
    }

    public static String removeWhitespace(String str){
        StringBuilder out=new StringBuilder();

        char[] strAsCharArr=str.toCharArray();
        for(char c:strAsCharArr){
            if(!Character.isWhitespace(c))
                out.append(c);
        }
        return out.toString();
    }
}
