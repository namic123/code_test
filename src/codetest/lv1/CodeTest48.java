package codetest.lv1;
import java.util.Arrays;

// 프로그래머스 1레벨 - 문자열 내림차순으로 배치하기
public class CodeTest48 {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        String answer = "";
        for(char c : charArr){
            answer+=c;
        }
        return new StringBuilder(answer).reverse().toString();
    }
}
