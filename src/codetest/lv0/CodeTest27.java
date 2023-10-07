package codetest.lv0;

import java.util.Stack;

public class CodeTest27 {
    public boolean backspaceCompare(String s, String t) {
        Stack<String>sStack=new Stack<>();
        Stack<String>tStack=new Stack<>();
        for(String str: s.split("")){
            if(!sStack.empty()&&str.equals("#"))sStack.pop();
            else if(!str.equals("#")) sStack.push(str);

            }
        for(String str: t.split("")){
            if(!tStack.empty()&&str.equals("#"))tStack.pop();
            else if(!str.equals("#"))tStack.push(str);
        }
        boolean bool = tStack.equals(sStack);
        return bool;
    }

    public static void main(String[] args) {
        CodeTest27 cd = new CodeTest27();
        System.out.println(cd.backspaceCompare("y#fo##f","y#f#o##f"));
    }
}
