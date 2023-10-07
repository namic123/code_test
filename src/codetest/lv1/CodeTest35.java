package codetest.lv1;

import java.util.stream.Stream;

public class CodeTest35 {

        public boolean solution(int x) {
           return x%Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum()==0;
        }
}
