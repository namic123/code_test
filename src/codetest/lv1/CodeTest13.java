package codetest.lv1;

import java.util.Arrays;

public class CodeTest13 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return (numbers[numbers.length-1]*numbers[numbers.length-2])>(numbers[0]*numbers[1])?numbers[numbers.length-1]*numbers[numbers.length-2]:numbers[0]*numbers[1];
    }
}
