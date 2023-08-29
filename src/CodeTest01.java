// 프로그래머스 0레벨 세로 읽기
public class CodeTest01 {
    public String solution(String my_string, int m, int c) {
        String[][] strArr = new String[my_string.length()/m][m];   // my_string 길이 만큼 2차원 배열 생성
        String[] str = my_string.split("");     // split 메서드로 my_string을 문자열 배열로 변환
        String answer = "";              // 답 추출을 위한 String변수
        int k =0;                   // my_string 길이만큼 2차원 배열에 담기 위한 변수
        for(int i=0; i<my_string.length()/m; i++){          //my_string 길이 나누기 m으로 반복 = 4
             for(int j=0; j<m; j++){
                 strArr[i][j] = str[k];                 // 1차원 i번째 2차원 j번째에 str k번째 대입
                 k++;                                   // 2중 반복에 상관 없이 my_string 길이만큼 진행되기 위한 증감
             }
            answer += strArr[i][c-1];           // str 1차원 i번째에 2차원 c-1번째 글자만 추출하여 변수에 대입
        }
        return answer;
    }
}
