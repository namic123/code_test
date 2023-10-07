package codetest.lv1;

import java.util.HashSet;
import java.util.Set;

public class CodeTest23 {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n: nums){
            if(set.contains(n)){return  n;}
            set.add(n);
        }
        return 0;
    }
}
