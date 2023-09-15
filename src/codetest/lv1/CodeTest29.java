package codetest.lv1;
public class CodeTest29 {
    //프로그래머스 1레벨 - 3진법 뒤집기(월간 코드 챌린지 시즌1)
    public int solution(int n) {
        return Integer.parseInt(new StringBuilder(Integer.toString(n,3)).reverse().toString(),3);
    }
}
