package codetest.lv2;

import java.util.Stack;

// 프로그래머스 2레벨 - 올바른 괄호 (스택/큐)
public class CodeTest55 {

boolean solution(String s) {
    Stack<Character> stkLeft = new Stack<>();
    Stack<Character> stkRight = new Stack<>();

    for(char c : s.toCharArray()) {
        if(c == '('){
            stkLeft.push(c);
        }else if(c==')') {
            stkRight.push(c);
        }
        if (stkRight.size()>stkLeft.size()){
            return false;
        }
    }
    return stkLeft.size() != stkRight.size()?false:true;
}
//    boolean solution(String s) {
//        int countLeft = 0;
//        int countRight= 0;
//        for(String str: s.split("")){
//            if (countRight > countLeft) {
//                return false;
//            }else if(str.equals(")")){
//                countRight++;
//            }
//            else{
//                countLeft++;
//            }
//        }
//        return countLeft != countRight?false:true;
//    }
}
