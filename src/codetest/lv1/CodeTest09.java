package codetest.lv1;

public class CodeTest09 {
    private static String babblingFilter(String str){
        if(str.contains("aya")||str.contains("ye")||str.contains("ma")||str.contains("woo")) {
            for (int i = 0; i < str.length(); i++) {
                        if (str.contains("1aya")) break;
                        str = str.replaceFirst("aya", "1");

                        if (str.contains("2ye")) break;
                        str = str.replaceFirst("ye", "2");

                       if (str.contains("3ma")) break;
                        str = str.replaceFirst("ma", "3");

                        if (str.contains("4woo")) break;
                        str = str.replaceFirst("woo", "4");
                    }
        }
        return str;
    }
    public int solution(String[] babbling) {
        int result = 0;
        for(int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replaceFirst("aya","1");
            babbling[i] = babbling[i].replaceFirst("ye","2");
            babbling[i] = babbling[i].replaceFirst("ma","3");
            babbling[i] = babbling[i].replaceFirst("woo","4");

            babbling[i] = babblingFilter(babbling[i]);
            for(int j=1; j<5; j++) {
                babbling[i] = babbling[i].replaceAll(String.valueOf(j), "");
            }
            if(babbling[i].equals("")){result++;}
        }
        return result;
    }
}
