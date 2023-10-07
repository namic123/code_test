package codetest.lv1;

public class CodeTest06 {
    // 프로그래머스 1레벨 - 자릿수 더하기
    public int solution(int n) {
        String[] str = String.valueOf(n).split("");
        int count = 0;
        for(int i=0;i<str.length;i++){
            count += Integer.parseInt(str[i]);
        }
        return count;
    }
}
