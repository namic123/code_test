package codetest.lv1;
// 프로그래머스 1레벨 - 월간 코드 챌린지 시즌1 (내적)
public class CodeTest46 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i =0; i <a.length; i++){
            answer = (a[i]*b[i])+answer;
        }
        return answer;
    }
}
