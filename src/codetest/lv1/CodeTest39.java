package codetest.lv1;

// 프로그래머스 1레벨 - 음양 더하기(월간 코드 챌린지 시즌2)
public class CodeTest39 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]){
                sum+=absolutes[i];
            } else {
                sum+=2147483647-(absolutes[i]+2147483647);
            }
        }
        return sum;
    }
}
