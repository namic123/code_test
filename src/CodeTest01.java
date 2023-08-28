// 프로그래머스 0레벨 세로 읽기
public class CodeTest01 {
    public String solution(String my_string, int m, int c) {
        String[][] strArr = new String[my_string.length()/m][m];
        String[] str = my_string.split("");
        String answer = "";
        int k =0;
        for(int i=0; i<my_string.length()/m; i++){
             for(int j=0; j<m; j++){
                 strArr[i][j] = str[k];
                 k++;
             }
            answer += strArr[i][c-1];
        }
        return answer;
    }
}
