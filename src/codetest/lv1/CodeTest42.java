package codetest.lv1;

import java.util.Arrays;

// 프로그래머스 1레벨 - 제일 작은 수 제거하기
public class CodeTest42 {
    public int solution(int[] numbers) {
        int sum = 0;
        Arrays.sort(numbers);
       for(int i= 0; i<10; i++) {
           if(Arrays.binarySearch(numbers,i) < 0){
               sum+=i;
           }
       }
        return sum;
    }
}
