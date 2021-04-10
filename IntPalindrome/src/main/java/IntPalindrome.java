package IntPalindrome;
import java.util.*;
import java.io.*;

/* EPI 4.9 Write a program that takes in integer and determines if that integer's representation as a decimal string is a palindrome.
  For example, your program should return true for inputs 0, 1, 7, 11, 121, 222, and false for the inputs -1, 12, 100.
*/

public class IntPalindrome {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public boolean isPalindrome (int x) {
        if (x < 0) return false; // negatives not palindrome
        if (x / 10 == 0) return true; // 1-9 is palindrome
        
        //Stack<Integer> s = new Stack<>();

        
        return false;
    }
}

/*
Inital thoughts:
    -I can process front to back or back to front.
        -Front to back would make it a bit harder cause i can't %
        -Back to front would be easier since I can % & /

    Tackle 1st runthrough
    -Lets do back to front 1st
    -I need a stack




*/
