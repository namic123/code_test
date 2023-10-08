package codetest.lv1;

// 프로그래머스 1레벨 - 월간 코드 챌린지 시즌2 (약수의 개수와 덧셈)
public class CodeTest47 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i < right+1; i++) {
            int count = 0;
            for (int j = 1; j < i+1; j++) {
                if(i%j==0) count++;
            }
            answer = (count%2==0)?answer+i:answer-i;
        }
        return answer;
    }
}
