package codetest.lv2;

// 프로그래머스 2레벨 - JadenCase 문자열 만들기
public class CodeTest52 {
    public String solution(String s) {
        String[] strArr = s.split("");
        String answer = "";
        for(int i = 0; i< strArr.length; i++){
            if(i == 0 || strArr[i-1].isBlank()){
                answer += strArr[i].toUpperCase();
            }else{
                answer += strArr[i].toLowerCase();
            }
        }
        return answer;
    }
}
