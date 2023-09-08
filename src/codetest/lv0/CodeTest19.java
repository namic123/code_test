package codetest.lv0;
import java.util.*;
public class CodeTest19 {
    // leetcode 1200
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = 1000000;
        for (int i = 0; i < arr.length; i++) {
                if(i != arr.length-1) min = Math.min(Math.abs(min),Math.abs(arr[i+1]-arr[i]));
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i!= arr.length-1) {
                if (arr[i] + min == arr[i+1]) {
                    list.add(new ArrayList<Integer>(Arrays.asList(arr[i], arr[i + 1])));
                } else if (arr[i] < 0 && arr[i] - min == arr[i+1]) {
                    list.add(new ArrayList<Integer>(Arrays.asList(arr[i], arr[i + 1])));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        CodeTest19 cd = new CodeTest19();
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        cd.minimumAbsDifference(arr);
    }
}
