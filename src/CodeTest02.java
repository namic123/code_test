import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class CodeTest02 {
    public int[] solution(String[] park, String[] routes) {
        String[][] checkerBoard = new String[park.length][park[0].length()];
        String[][] routesArray = new String[routes.length][2];
        int s[] = new int[2];
        ArrayList<Integer> listIdx01 = new ArrayList<Integer>();
        ArrayList<Integer> listIdx02 = new ArrayList<Integer>();
        String tmp;
        int l, r = 0;


        for (int i = 0; i < park.length; i++) {         // park를 2차원 배열로. 문자열 길이 x park의 길이
            l = 0;
            for (char c : park[i].toCharArray()) {
                checkerBoard[i][l] = String.valueOf(c);
                if (c == 'S') {
                    s[0] = i;
                    s[1] = l;
                }
                ;     // 시작 좌표 저장
                if (c == 'X') {                   // 장애물 좌표 값 저장
                    listIdx01.add(i);
                    listIdx02.add(l);
                }
                l++;
            }
        }

        for (int i = 0; i < routes.length; i++) {        // 방향 좌표 값 추출
            tmp = routes[i].replace(" ", "");       // 요소 안에 공백 제거
            for (int j = 0; j < 2; j++) {
                routesArray[i][j] = tmp.split("")[j]; // routes 요소를 다시 배열로 변환하여 2차원 배열에 할당

            }
        }
        int[] reset = new int[2];       // 장애물을 위한 값 초기화
        for (int i = 0; i < routesArray.length; i++) {
            reset[0] = s[0];            // 이동 전 y축 값 저장
            reset[1] = s[1];            // 이동 전 x축 값 저장

            if (routesArray[i][0] == "N") {         // 위로 이동
                s[0] -= Integer.parseInt(routesArray[i][1]);    // N은 y축 - n
                if (listIdx02.contains(s[1]) && (listIdx01.get(i) <= s[0])) { // 'X' 장애물을 만났을 경우 이동 전으로 리셋
                    s[0] = reset[0];
                }
            }

            else if (routesArray[i][0] == "W") {    // 좌로 이동
                s[1] -= Integer.parseInt(routesArray[i][1]);    // W은 x축 - n
                if (listIdx01.contains(s[0])&&(listIdx02.get(i) <= s[1])){
                    s[1] = reset[1];
                }
            }

            else if (routesArray[i][0] == "S"){     // 아래로 이동
                s[0] += Integer.parseInt(routesArray[i][1]);    // S은 y축 + n
                if (listIdx02.contains(s[1]) && (listIdx01.get(i) >= s[0])){
                    s[0] = reset[0];
                }
            }
            else if (routesArray[i][0] == "E"){
                s[1] += Integer.parseInt(routesArray[i][1]);   // E은 y축 + n
                if (listIdx01.contains(s[0])&&(listIdx02.get(i) >= s[1])){
                    s[1] = reset[1];
                }
            }

        }
        System.out.println("routesArray = " + routesArray.length);
        System.out.println("Xlist " + listIdx01.get(0) + "," + listIdx02.get(0));
        int[] a = {1};
        return a;
    }

    public static void main(String[] args) {
        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};
        CodeTest02 c2 = new CodeTest02();
        c2.solution(park, routes);
    }
}
