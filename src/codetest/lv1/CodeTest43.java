package codetest.lv1;
import java.util.*;

public class CodeTest43 {
    // 프로그래머스 1레벨 - 제일 작은 수 제거하기
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int countMin = 10000;
        int saveIndex = 0;

        for(int i=0; i<arr.length;i++){
            list.add(arr[i]);
            if(countMin > arr[i]){
                countMin = Math.min(countMin, arr[i]);
                saveIndex = i;
            }
        }
        if(list.size() != 0) list.remove(saveIndex);

        if(list.size() != 0){
            int[] answer = new int[list.size()];
            for(int i = 0; i< answer.length; i++){
                answer[i]=list.get(i);
            }
            return answer;
        }

        return new int[]{-1};
    }

}
