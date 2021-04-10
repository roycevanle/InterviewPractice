package IntPalindrome;
import java.util.*;

/* EPI 4.9 Write a program that takes in integer and determines if that integer's representation as a decimal string is a palindrome.
  For example, your program should return true for inputs 0, 1, 7, 11, 121, 222, and false for the inputs -1, 12, 100.
https://leetcode.com/problems/palindrome-number/submissions/
  */

public class IntPalindrome {
    public static void main(String[] args) throws Exception {
        System.out.println("What int do you want to check? : ");
        Scanner myObj = new Scanner(System.in);
        int userInt = myObj.nextInt();
        System.out.println("The number " + userInt + " is " + isPalindrome(userInt) + " palindrome");
    }

    public static boolean isPalindrome (int x) {
        if (x < 0) return false; // negatives not palindrome
        if (x / 10 == 0) return true; // 1-9 is palindrome
        
        Stack<Integer> s = new Stack<>();
        int leftover = x;
        int len = String.valueOf(x).length();
        
        for (int i = 0; i < len / 2; i++) {
            s.push(leftover % 10);
            leftover = leftover / 10;
        }

        // we do this so that we skip the middle since its not essential to palindrome when # odd
        if (len % 2 == 1) {
            leftover = leftover / 10;
        }

        for (int i = 0; i < len / 2; i++) {
            if (s.pop() != leftover % 10) {
                return false;
            }
            leftover = leftover / 10;
        }

        
        return true;
    }
}

/*
Inital thoughts:
    -I can process front to back or back to front.
        -Front to back would make it a bit harder cause i can't %
        -Back to front would be easier since I can % & /

    Tackle 1st runthrough
    -Lets do back to front 1st
        don't need to keep track of indexes (so don't needa do len-1, etc...)

    -I need a stack

    -To process the least sig fig
        1221 % 10 = 1
        Leftover is 1221 / 10 = 122

    -When to stop
        middle
        1221 should stop at 4/2 = 2
        1123211 should stop at 5/2 = 2
    


*/
