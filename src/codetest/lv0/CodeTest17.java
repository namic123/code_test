package codetest.lv0;
import java.util.*;
public class CodeTest17 {
    // leetcode 118
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list = new ArrayList<>();
        for(int i =0; i<numRows; i++){
            list.add(i,new ArrayList<Integer>());
            list.get(i).add(1);
            for (int j = 1; j < i; j++) {
                list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            if(i!=0)list.get(i).add(1);
        }
        return list;
    }
}
