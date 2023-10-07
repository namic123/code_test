package codetest.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeTest31 {
    public int[] solution(long n) {
        StringBuffer sb = new StringBuffer().append(n).reverse();
        int[] answer = Arrays.stream(sb.toString().split("")).mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}
