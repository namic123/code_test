package codetest.lv1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CodeTest61 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for(int n:arr){
            if(stack.empty() || stack.peek() != n) {
                stack.push(n);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
