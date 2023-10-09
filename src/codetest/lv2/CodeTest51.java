package codetest.lv2;

import java.util.TreeMap;
// 프로그래머스 2레벨 - 최댓값과 최솟값
public class CodeTest51 {
    public String solution(String s) {
        String answer = "";
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        for(String str :s.split(" ")){
            map.put(Integer.parseInt(str),str);
     }
        answer = map.firstKey()+ " "+ map.lastKey();
        return answer;
    }
}
