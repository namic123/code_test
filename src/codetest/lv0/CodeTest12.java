package codetest.lv0;

public class CodeTest12 {
    public int[] solution(int n, int k) {
        int[] result = new int [n/k];
        int j =0;
        for (int i = k; i <= n; i+=k) {
            if(i % k == 0) result[j] = i; j++;
        }
        return result;
    }
}
