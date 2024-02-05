package codetest.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeTest57 {
    public String solution(String X, String Y) {
        String result = "";
        List<Integer> intResult = new ArrayList<>();
        for(String yc: Y.split("")){
            for(String xc : X.split("")){
                if( yc.equals(xc)){
                    intResult.add(Integer.parseInt(xc));
                    break;
                }
            }
        }
        if(intResult.size() == 0){ return  "-1";
        }else{
            Collections.sort(intResult, Collections.reverseOrder());
            for(int j= 0; j< intResult.size(); j++){
                result += intResult.get(j);
            }
        }

        return Integer.parseInt(result) == 0?"0":result;
    }

}
