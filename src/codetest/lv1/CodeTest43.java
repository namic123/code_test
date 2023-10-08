package codetest.lv1;
import java.util.*;

public class CodeTest43 {
    public Integer[] solution(int[] arr) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        if(arr.length == 1)return new Integer[]{-1};
        for(int num:arr){
            treeSet.add(num);
        }
        treeSet.pollFirst();
        return treeSet.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        CodeTest43 cd = new CodeTest43();
        cd.solution(new int[]{4,3,2,1});
    }
}
