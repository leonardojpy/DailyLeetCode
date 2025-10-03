package FizzBuzz;

//LeetCode description: https://leetcode.com/problems/fizz-buzz/description

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        int contador = 0;
        while (contador < n) {
            contador++;
            if (contador % 3 == 0 && contador % 5 == 0){
                answer.add("FizzBuzz");
            } else if (contador % 5 == 0){
                answer.add("Buzz");
            } else if (contador % 3 == 0){
                answer.add("Fizz");
            } else {
                answer.add(String.valueOf(contador));
            }
        }
        System.out.println(answer);
        return answer;
    }
}

