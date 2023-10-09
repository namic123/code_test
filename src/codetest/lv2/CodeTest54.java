package codetest.lv2;

// 프로그래머스 2레벨 - 숫자의 표현
public class CodeTest54 {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i < n+1; i++) {
            int sum = 0;
            for (int j = i; j < n+1; j++) {
                sum+=j;
                if(sum == n){count++;} else if (sum>n) {
                    break;
                }
            }
        }
        return count;
    }
}
