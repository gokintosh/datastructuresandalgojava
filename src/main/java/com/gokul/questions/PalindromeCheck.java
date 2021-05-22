package com.gokul.questions;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("gokul"));
        System.out.println(isPalindrome("malayalam"));
    }

    public static boolean isPalindrome(String str){
        boolean result=true;

        int length=str.length();

        for(int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-1-i))
                return false;
        }
        return true;
    }
}
