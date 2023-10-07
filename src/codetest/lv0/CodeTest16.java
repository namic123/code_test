package codetest.lv0;

import java.util.*;

public class CodeTest16 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();

        for (int stone : stones) {
            list.add(stone);
        }
        while (list.size() > 1) {
            // 1.sort
            list.sort((o1, o2) -> o2 - o1);

            // 2.remove
            int stone1 = list.remove(0);
            int stone2 = list.remove(0);

            // 3.add
            int diff = stone1 - stone2;
            if (diff > 0) {
                list.add(diff);
            }

        }

        if (list.size() == 1) {
            return list.get(0);
        }

        return 0;
    }
}
