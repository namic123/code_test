package codetest.lv1;

// 프로그래머스 1레벨 - 가운데 글자 가져오기
public class CodeTest44 {
    public String solution(String s) {
        return s.length()%2==0? s.split("")[s.length()/2-1]+s.split("")[s.length()/2]:s.split("")[s.length()/2];
    }
}
