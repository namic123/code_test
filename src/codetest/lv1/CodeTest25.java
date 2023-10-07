package codetest.lv1;

import java.util.HashSet;
import java.util.Set;

public class CodeTest25 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<String> set = new HashSet<>();
        int count = 0;
        boolean bool = false;
        for(String s : allowed.split("")) {
            set.add(s);
        }
        for(int i=0; i< words.length; i++){
            for(String s: words[i].split("")){
                if (!set.contains(s)){bool=false;break;}
                if(set.contains(s)){bool=true;}
            }
            if(bool) count++;
        }
        return count;
    }
}
