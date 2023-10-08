package codetest.lv1;

// 프로그래머스 1레벨 - 수박수박수박수박수박수?
public class CodeTest45 {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (answer.length()%2==0){
                answer+="수";
            }else {
                answer+="박";
            }
        }
        return answer;
    }

}
