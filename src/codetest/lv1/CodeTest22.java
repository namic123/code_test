package codetest.lv1;

public class CodeTest22 {
    // 프로그래머스 1레벨 - 로또의 최고 순위와 최저 순위 (2021 Dev-Matching: 웹 백엔드 개발자(상반기))
    public int[] solution(int[] lottos, int[] win_nums) {
        int count_max = 7;
        int count_min = 7;
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if(win_nums[i] == lottos[j]){
                    count_max--;
                    count_min--;
                }
            }
            if (lottos[i] == 0) {
                count_max--;
            }
        }
        if(count_min == 7) count_min--;
        else if(count_max==7) count_max--;
        int[] result ={count_max, count_min};
        return result;
    }
}
