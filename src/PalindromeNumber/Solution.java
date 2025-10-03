package PalindromeNumber;

//LeetCode description: https://leetcode.com/problems/palindrome-number/description

public class Solution {

    public boolean isPalindrome(int x) {

        //Negative numbers can't be palindromes.
        if (x < 0) {
            return false;
        }

        //Every single digit positive number is a palindrome (0-9).
        if (x <= 9 && x > 0) {
            System.out.println("Every single digit positive number is a palindrome.");
            return true;
        }

        String numero = String.valueOf(x);
        int left = 0;
        int right = numero.length() - 1;

        while (left < right) {
            if (numero.charAt(left) != numero.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


