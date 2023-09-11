package codetest.lv1;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CodeTest26 {
    // 프로그래머스 1레벨 크레인 인형 뽑기 게임 - 2019 카카오 개발자 겨울 인턴십
    public int solution(int[][] board, int[] moves) {
        List<Stack<Integer>> stackList = new ArrayList<>();             // N x N 크기의 정사각 격자
        Stack<Integer> resultStack = new Stack<Integer>();              // 뽑힌 요소를 담는 스택
        int result = 0;
        for (int i = 0; i < board.length; i++) {                        // 2차원 배열을 담기 위한 반복문
            stackList.add(new Stack<Integer>());
            for (int j = board[i].length-1; j > -1; j--) {
                if(board[j][i]==0) continue;                            // 0을 만날 경우 현재 반복 무시
                else stackList.get(i).push(board[j][i]);                // 1차원 배열의 요소를 순차적으로 뽑지 않고 j차원 배열의 i인덱스 순서로 순회
            }                                                           // 예를 들어 배열[4][0] -> 배열[3][0] -> 배열[2][0] -> 배열 [1][0] ......
        }
        for(int n: moves){                                              // 인형 뽑기 실행
                if(!resultStack.empty()&&!stackList.get(n-1).empty()&&resultStack.peek().equals(stackList.get(n-1).peek())) {  // 스택의 가장 위 요소가 뽑은 인형이랑 동일한 인형일 경우 실행
                    resultStack.pop();                                  // 뽑힌 요소를 담는 스택에 가장 마지막 요소 제거
                    stackList.get(n - 1).pop();                         // 뽑을 요소를 담고 있는 스택의 뽑힌 요소 제거
                    result+=2;                                          // 2개의 인형 부터 터지므로, result +2
                } else{
                    if(!stackList.get(n-1).empty()) {
                    resultStack.push(stackList.get(n - 1).peek());      // 뽑은 인형 push
                        stackList.get(n - 1).pop();                     // 뽑힌 인형 pop
                    }
                }
        }
        return result;
    }
}
