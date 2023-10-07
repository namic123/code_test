package codetest.lv1;

import java.util.HashSet;
import java.util.Set;

public class CodeTest24 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for(String s: jewels.split("")){
            set.add(s);
        }
        for (String s:stones.split("")){
            if(set.contains(s)){count++;}
        }

        return count;
    }
}
