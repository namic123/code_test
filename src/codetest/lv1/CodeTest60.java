package codetest.lv1;

public class CodeTest60 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2]; // 최대공약수와 최소공배수를 저장할 배열 초기화

        // 최대공약수 계산
        answer[0] = gcd(n, m);

        // 최소공배수 계산
        answer[1] = lcm(n, m);
        System.out.println(answer[0] +","+answer[1]);
        return answer;
    }

    // 유클리드 호제법을 이용한 최대공약수 계산 메소드
    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // 최소공배수 계산 메소드
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
