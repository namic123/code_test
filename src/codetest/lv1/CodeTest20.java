package codetest.lv1;

import java.util.*;

public class CodeTest20 {
    //  프로그래머스 1레벨 - 카드 뭉치
    // Arrays랑 Stream 사용 익숙해지기 위한 목적
    public String compareCards(String[] cards1, String[] cards2, List<String> equalsCard1, List<String> equalsCard2, String[] goal){
        int i =0, j=0;
        for(String str:cards2){
            if(Arrays.stream(goal).anyMatch(str::equals)){
                equalsCard1.remove(str);
            }
            if(!(Arrays.asList(goal).contains(str))){
                cards2 = Arrays.stream(cards2)
                        .filter(item ->!item.equals(str))
                        .toArray(String[]::new);
                i++;
            }
            if(Arrays.asList(goal).contains(str)){
                if(i > j) return "No";
            }
        }
        i=0; j=0;
        for(String str:cards1){
            if(Arrays.stream(goal).anyMatch(str::equals)){
                equalsCard2.remove(str);
            }
            if(!(Arrays.asList(goal).contains(str))){
                cards1 = Arrays.stream(cards1)
                        .filter(item ->!item.equals(str))
                        .toArray(String[]::new);
                i++;
            }
            if(Arrays.asList(goal).contains(str)){
                if(i > j) return "No";
            }
        }
        String result = Arrays.equals(equalsCard1.toArray(),cards1)&&Arrays.equals(equalsCard2.toArray(),cards2)?"Yes":"No";
        return result;
    }
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> equalsCard1 = new ArrayList<>(Arrays.asList(goal));
        List<String> equalsCard2 = new ArrayList<>(Arrays.asList(goal));

        return compareCards(cards1, cards2, equalsCard1, equalsCard2, goal);
    }
}
