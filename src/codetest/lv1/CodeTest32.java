package codetest.lv1;

import java.util.Arrays;

public class CodeTest32 {
    boolean solution(String s) {
        long countY = Arrays.stream(s.split("")).filter(i->i.equalsIgnoreCase("y")).count();
        long countP = Arrays.stream(s.split("")).filter(i->i.equalsIgnoreCase("p")).count();
        return countY==countP;
    }
}
