package codetest.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeTest28 {

    // 프로그래머스 2레벨 -이진 변환 반복하기(월간 코드 챌린지 시즌1)
    public int[] solution(String s) {
        String str = s;
        int[] result = new int[2];
        int i, j=0;
        while(true){
            if(!str.contains("0")&&str.length()==1) break;
            i = Arrays.stream(str.split(""))
                    .filter(x->x.equals("0"))
                    .reduce("", String::concat).length();
            str = String.valueOf(Arrays.stream(str.split(""))
                    .filter(x->x.equals("1"))
                    .reduce("", String::concat).length());
            j++;
            result[0] =j;
            result[1]+=i;
            str = Integer.toBinaryString(Integer.parseInt(str));
        }
    return result;
    }
}
