package codetest.lv1;

// 프로그래머스 1레벨 - 문자열 다루기 기본
public class CodeTest50 {
    public boolean solution(String s) {
        try{
            Integer.valueOf(s);
            if(s.length() == 4||s.length() == 6){
                return true;
            }else {
                return false;
            }
        }catch (NumberFormatException e){
            return false;
        }
    }
}
