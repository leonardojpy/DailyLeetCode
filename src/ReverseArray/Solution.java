package ReverseArray;

public class Solution {
    public static int[] inverterArray(int[] numeros){
        int esquerda = 0;
        int direita = numeros.length - 1;

        while (esquerda < direita){
            int temp = numeros[direita];
            numeros[direita] = numeros[esquerda];
            numeros[esquerda] = temp;
            esquerda++;
            direita--;
        }
        return numeros;
    }
}
