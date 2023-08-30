import java.util.ArrayList;
import java.util.Arrays;

class CodeTest02 {

    //프로그래머스 1레벨 공원 산책
    //지나다니는 길을 'O', 장애물을 'X'로 나타낸 직사각형 격자 모양의 공원에서 로봇 강아지가 산책을 하려합니다. 산책은 로봇 강아지에 미리 입력된 명령에 따라 진행하며, 명령은 다음과 같은 형식으로 주어집니다.
    //["방향 거리", "방향 거리" … ]
    //예를 들어 "E 5"는 로봇 강아지가 현재 위치에서 동쪽으로 5칸 이동했다는 의미입니다. 로봇 강아지는 명령을 수행하기 전에 다음 두 가지를 먼저 확인합니다.
    //주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
    //주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
    //위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.
    //공원의 가로 길이가 W, 세로 길이가 H라고 할 때, 공원의 좌측 상단의 좌표는 (0, 0), 우측 하단의 좌표는 (H - 1, W - 1) 입니다.


    public int[] solution(String[] park, String[] routes) {
        String[][] routesArray = new String[routes.length][2];          // 방향 명령을 담는 2차원 배열
        int s[] = new int[2];                                           // 시작 좌표 값
        ArrayList<Integer> listIdx01 = new ArrayList<Integer>();        // 장애물 y좌표 값
        ArrayList<Integer> listIdx02 = new ArrayList<Integer>();        // 장애물 x좌표 값
        String tmp;
        int l;


        for (int i = 0; i < park.length; i++) {                         // 시작 지점, 장애물 좌표 값 구하기
            l = 0;
            for (char c : park[i].toCharArray()) {                      // park 배열 순회
                if (c == 'S') {                                         // 시작 지점을 찾으면 실행
                    s[0] = i;                                           // 시작 지점 y축
                    s[1] = l;                                           // 시작 지점 x축
                };
                if (c == 'X') {                                         // 장애물을 찾으면 실행
                    listIdx01.add(i);                                   // 장애물 y축
                    listIdx02.add(l);                                   // 장애물 x축
                }
                l++;
            }
        }
        int[][] obstacle = new int[listIdx01.size()][2];                // 장애물 x,y축을 2차원 배열로 묶기
        for(int i=0; i<obstacle.length;i++){                            // 장애물의 갯수 만큼 실행
            obstacle[i][0] = listIdx01.get(i);                          // 장애물 y축 저장
            obstacle[i][1] = listIdx02.get(i);                          // 장애물 x축 저장
        }
        for (int i = 0; i < routes.length; i++) {                       // 이동 명령 개수만큼 실행
            tmp = routes[i].replace(" ", "");        // 이동 명령 공백 없애서 임시 저장
            for (int j = 0; j < 2; j++) {
                routesArray[i][j] = tmp.split("")[j];             // 방향과 이동할 거리를 잘라서 배열로 변환
            }
        }
        int[] reset = new int[2];                                        // 장애물을 만날 경우 리셋하기 위한 배열
        for (int i = 0; i < routesArray.length; i++) {                   // 이동 명령 수행
            reset[0] = s[0];
            reset[1] = s[1];


            if (routesArray[i][0].equals("N")) {                         // 이동 명령이 북쪽일 경우
                for (int j = 0; j < Integer.parseInt(routesArray[i][1]); j++) {
                    s[0]--;                                              // 위로 이동
                    for(int k=0;k<obstacle.length;k++) {
                        if (Arrays.equals(obstacle[k], s) || (s[0] < 0)) {    // 장애물을 만났거나, 범위를 벗어난 경우
                            s[0] = reset[0];                             // 이동 명령 수행 전의 초기 값 복구
                            break;
                        }
                    }
                    if(s[0]==reset[0])break;
                }
            }

            if (routesArray[i][0].equals("W")) {                         // 이동 명령이 동쪽일 경우
                for (int j = 0; j < Integer.parseInt(routesArray[i][1]); j++) {
                    s[1]--;                                              // 좌로 이동
                    for(int k=0;k<obstacle.length;k++) {
                        if (Arrays.equals(obstacle[k], s) || (s[1] < 0)) {    // 장애물을 만났거나, 범위를 벗어난 경우
                            s[1] = reset[1];                             // 이동 명령 수행 전의 초기 값 복구
                            break;
                        }
                    }
                    if(s[1]==reset[1])break;
                }
            }

            if (routesArray[i][0].equals("S")){                         // 이동 명령이 남쪽일 경우
                for (int j = 0; j < Integer.parseInt(routesArray[i][1]); j++) {
                    s[0]++;                                             // 아래로 이동
                    for(int k=0;k<obstacle.length;k++) {
                        if (Arrays.equals(obstacle[k], s) || (s[0] >= park.length)){ // 장애물을 만났거나, 범위를 벗어난 경우
                            s[0] = reset[0];                            // 이동 명령 수행 전의 초기 값 복구
                            break;
                        }
                    }
                    if(s[0]==reset[0])break;
                }
            }
            if (routesArray[i][0].equals("E")){                         // 이동 명령이 동쪽일 경우
                for (int j = 0; j < Integer.parseInt(routesArray[i][1]); j++) {
                    s[1]++;                                             // 우로 이동
                    for(int k=0;k<obstacle.length;k++){
                        if(Arrays.equals(obstacle[k], s) ||  (s[1] >= park[0].length())){   // 장애물을 만났거나, 범위를 벗어난 경우
                            s[1] = reset[1];                        // 이동 명령 수행 전의 초기 값 복구
                            break;
                        }
                    }
                    if(s[1]==reset[1])break;
                }
            }
        }
        return s;
    }
}