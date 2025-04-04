package PalindromeNumber;

//LeetCode description: https://leetcode.com/problems/palindrome-number/description/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean isPalindrome(int x) {
        List<Character> index = new ArrayList<>();
        if (x < 0){
            throw new IllegalArgumentException("Only positive numbers are palindromes.");
        }
        String numero = String.valueOf(x);
        for (int i = 0; i < numero.length(); i++){
            index.add((numero.charAt(i)));
        }
        int i = 0;
        while (i < index.size()){
            if (index.getFirst() == index.getLast()){
                index.removeFirst();
                index.removeLast();
                i++;
            } else {
                return false;
            }
        }
    return true;
    }
}
