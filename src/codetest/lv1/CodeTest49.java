package codetest.lv1;

public class CodeTest49 {
    public long solution(int price, int money, int count) {
        long total = 0;
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += price;
            total += sum;
        }
        return total>money?total-money:0;
    }
}
