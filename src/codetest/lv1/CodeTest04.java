package codetest.lv1;

public class CodeTest04 {
    public int solution(int n) {
        // 프로그래머스 1레벨 - 약수의 합
        //정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
        int sum = 0;
        for(int i=1; i<n+1; i++) if(n % i == 0)sum+=i;
        return sum;
    }
}
