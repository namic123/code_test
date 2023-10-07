package codetest.lv1;

public class CodeTest30 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int avg:arr){
            answer += avg;
        }
        return answer/arr.length;
    }
}
