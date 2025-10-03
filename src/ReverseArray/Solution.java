package ReverseArray;
//This exercise is not on LeetCode
public class Solution {
    public static int[] inverterArray(int[] numeros){
        int left = 0;
        int right = numeros.length - 1;

        while (left < right){
            int temp = numeros[right];
            numeros[right] = numeros[left];
            numeros[left] = temp;
            left++;
            right--;
        }
        return numeros;
    }
}