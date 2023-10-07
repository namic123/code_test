package codetest.lv1;

// 프로그래머스 1레벨  -정수 제곱근 판별
public class CodeTest33 {
    public long solution(long n) {
        return Math.pow((long) Math.sqrt(n), 2) == n ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}
