
// 프로그래머스 1레벨 - 옹알이2

//머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
// 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서
// 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다.
// 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는
// 단어의 개수를 return하도록 solution 함수를 완성해주세요.

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
        for(int i=0; i<babbling.length; i++){                                                   // 발음 가능한 단어 중 하나만 추출
            babbling[i] = babbling[i].replaceFirst("aya","1");
            babbling[i] = babbling[i].replaceFirst("ye","2");
            babbling[i] = babbling[i].replaceFirst("ma","3");
            babbling[i] = babbling[i].replaceFirst("woo","4");

            babbling[i] = babblingFilter(babbling[i]);                                          // 연속적이지 않고, 남아있는 발음이 있을 경우, 메서드 실행
            for(int j=1; j<5; j++) {
                babbling[i] = babbling[i].replaceAll(String.valueOf(j), "");        // replace한 문자 빈 문자열로 변환
            }
            if(babbling[i].equals("")){result++;}                                               // 요소가 빈 문자열인 경우 result + 1
        }
        return result;
    }
}
