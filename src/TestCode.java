import codetest.lv0.CodeTest05;
import codetest.lv1.CodeTest08;
import codetest.lv1.CodeTest09;
import codetest.lv1.CodeTest11;

import java.io.StringReader;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class TestCode {
    public boolean divideArray(int[] nums) {
        return  Arrays.stream(nums)
                .boxed()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                )
                .entrySet()
                .stream()
                .allMatch(new Predicate<Map.Entry<Integer, Long>>() {
                    @Override
                    public boolean test(Map.Entry<Integer, Long> integerLongEntry) {
                        return integerLongEntry.getValue() %2 ==1 ? false:true;
                    }
                });

    }
}