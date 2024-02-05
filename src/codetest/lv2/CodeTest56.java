package codetest.lv2;

public class CodeTest56 {
    public int solution(int n) {
        int answer = n+1;
        long count1 = getChars(n);
        while (count1!= getChars(answer)){
                answer++;
        }

        return answer;
    }

    private static long getChars(int count) {
        return Integer.toBinaryString(count).chars().filter(x->x=='1').count();
    }
}
