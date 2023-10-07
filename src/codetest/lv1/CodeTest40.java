package codetest.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// 프로그래머스 1레벨 - 나누어 떨어지는 숫자 배열
public class CodeTest40 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list =  new ArrayList<Integer>();
        for (int num : arr){
            if(num%divisor==0)list.add(num);
        }
        if(list.size()==0){
            list.add(-1);
        }else {
            Collections.sort(list);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
