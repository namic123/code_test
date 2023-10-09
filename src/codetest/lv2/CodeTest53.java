package codetest.lv2;


import java.util.Arrays;

// 프로그래머스 2레벨 - 최솟값 만들기
public class CodeTest53 {
    public int solution(int []A, int []B){
        Arrays.sort(A);
        Arrays.sort(B);
        int j = B.length-1;
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i]*B[j];
            j--;
        }
        return answer;
    }

}
