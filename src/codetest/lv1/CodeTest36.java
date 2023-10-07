package codetest.lv1;
// 프로그래머스 1레벨 - 두 정수 사이의 합
public class CodeTest36 {
    public long solution(int a, int b) {
        int min = Math.min(a,b);
        int max = Math.max(a,b)+1;
        long sum = 0;
        for (int i = min; i < max; i++) {
            sum+=i;
        }
        return sum;
    }
}
