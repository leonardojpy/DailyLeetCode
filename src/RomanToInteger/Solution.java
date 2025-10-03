package RomanToInteger;

public class Solution {

    private int translate(char c){
        return switch (c){
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt(String s){
        int soma = 0;
        int ultimoDigito = translate(s.charAt(s.length() - 1));

        for (int i = 0; i < s.length() - 1; i++){
            if (translate(s.charAt(i)) < translate(s.charAt(i + 1))){
                soma -= translate(s.charAt(i));
            } else {
                soma += translate(s.charAt(i));
            }
        }

        return soma + ultimoDigito;    }
}
