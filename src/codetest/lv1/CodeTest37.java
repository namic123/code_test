package codetest.lv1;
// 프로그래머스 1레벨 - 콜라츠 추측
public class CodeTest37 {
    public int solution(int num) {
        int count = 0;
        long collatz = num;
        while(collatz != 1){
            if(collatz%2==0){
                collatz /= 2;
            }else {
                collatz = collatz*3+1;
            }
            count++;
        }
        return count>=500?-1:count;
    }
}
