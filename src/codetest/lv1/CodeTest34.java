package codetest.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 프로그래머스 1레벨 - 정수 내림차순으로 배치하기
public class CodeTest34 {
    public long solution(long n) {
        List<String> list = new ArrayList<String>(Arrays.asList((n + "").split("")));
        Collections.sort(list, Collections.reverseOrder());
        String str="";
        for(String s: list){
            str+=s;
        }
        return Long.parseLong(str);
        }
}
