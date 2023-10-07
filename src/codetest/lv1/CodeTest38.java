package codetest.lv1;
// 프로그래머스 1레벨 - 서울에서 김서방 찾기
public class CodeTest38 {
    public String solution(String[] seoul) {
        for(int i=0; i<seoul.length;i++){
            if(seoul[i].equalsIgnoreCase("kim")){
                return "김서방은 "+i+"에 있다.";
            }
        }
        return "";
    }
}
