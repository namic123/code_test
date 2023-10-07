package codetest.lv0;
import java.util.*;
public class CodeTest15 {
    // leet code 2089
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){li.add(i);}
        }
        return li;
    }
}
