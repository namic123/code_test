package codetest.lv0;

import java.util.*;

public class CodeTest14 {
    // leet코드 1431 문제 풀이
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lb = new ArrayList<Boolean>();
        int max_candy = 0;
        for(int c:candies){
           max_candy= Math.max(max_candy, c);
        }
        for (int i = 0; i < candies.length; i++) {
            candies[i]+=extraCandies;
            lb.add(candies[i]>=max_candy?true:false);
        }
        return lb;
    }
}
