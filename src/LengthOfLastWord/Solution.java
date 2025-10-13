package LengthOfLastWord;


import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.lengthOfLastWord("   fly me   to   the moon  ");
    }

    public int lengthOfLastWord(String s) {

        String trimmed = s.trim();
        int i = trimmed.length() - 1;
        String lastWord = "";

        while (i >= 0){
            if (trimmed.charAt(i) != ' ') {
                lastWord += String.valueOf(trimmed.charAt(i));
                i--;
            } else {
                return lastWord.length();
            }
        }

        return lastWord.length();

    }
}
