package codetest.lv1;

public class CodeTest09 {
    public int solution(String[] babbling) {
        int result = 0;
        for(int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replaceFirst("aya","!");
            if(!babbling[i].contains("!aya")){
                while (babbling[i].contains("aya")) {
                    babbling[i] = babbling[i].replaceFirst("aya", "!");
                }
            }
            babbling[i] = babbling[i].replaceFirst("ye","!");
            if(!babbling[i].contains("!ye")){
                while (babbling[i].contains("ye")) {
                    babbling[i] = babbling[i].replaceFirst("ye", "!");
                }
            }
            babbling[i] = babbling[i].replaceFirst("ma","!");
            if(!babbling[i].contains("!ma")){
                while (babbling[i].contains("ma")) {
                    babbling[i] = babbling[i].replaceFirst("ma", "!");
                }
            }
            babbling[i] = babbling[i].replaceFirst("woo","!");
            if(!babbling[i].contains("!woo")){
                while (babbling[i].contains("woo")) {
                    babbling[i] = babbling[i].replaceFirst("woo", "!");
                }
            }
            babbling[i] = babbling[i].replaceAll("!","");
            if(babbling[i].equals("")){result++;}
        }
        return result;
    }
}
