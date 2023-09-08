package codetest.lv0;

import java.util.ArrayList;
import java.util.List;

public class CodeTest18 {
    // leetcode 119
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>list = new ArrayList<>();
        for(int i =0; i<=rowIndex; i++){
            list.add(i,new ArrayList<Integer>());
            list.get(i).add(1);
            for (int j = 1; j < i; j++) {
                list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            if(i!=0)list.get(i).add(1);
        }
        List<Integer> li = new ArrayList<>(list.get(rowIndex));
        return li;
    }
}
