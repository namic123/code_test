package codetest.lv1;

import java.util.*;

public class CodeTest21 {
    // 프로그래머스 1레벨 실패율 - 2019 KAKAO BLIND RECRUITMENT
    public int[] solution(int N, int[] stages) {
        double participant, failureCount, failureRate;                                      // 참가와 실패 인원, 실패율 계산
        TreeMap<Double,ArrayList<Integer>> failureTree = new TreeMap<>();                   // TreeMap 자동 정렬, 중복 실패율을 위한 List
        int[] stageFailureRate = new int[N];                                                // 실패율 배열
        
        for (int i = 0; i < N; i++) {
            participant=0;                                                                  // 값 초기화
            failureCount=0;
            failureRate =0;
            for (int j = 0; j < stages.length; j++) {
                if((i+1)<=stages[j]) participant++;                                         // 참가 인원이 몇명인지 카운트
                if((i+1)==stages[j]) failureCount++;                                        // 스테이지 실패한 인원 카운트
            }
            if(participant==0&&failureCount==0) failureRate=-1;                             // 도전자가 없는 스테이지인 경우 0/0이 되므로 배열에 순차적으로 할당하기 위함.
            else failureRate = failureCount/participant;                                    // 실패율 계산
            if(failureTree.containsKey(failureRate)){                                       // 중복된 실패율이 있는 경우
                failureTree.get(failureRate).add(i+1);                                      // list에 스테이지 추가
            }else{
                failureTree.put(failureRate, new ArrayList<Integer>(Arrays.asList(i+1)));   // 중복이 아닌 경우 새 list 생성
            }
        }
        int k = 0;
        for (int i = 0; i < stageFailureRate.length; i++) {                                 // 실패율 높은 순으로 스테이지 배열에 옮기기
          if(failureTree.isEmpty()){break;}                                                 // 트리가 비었을 경우 break
            for(int j=0; j< failureTree.lastEntry().getValue().size(); j++){                // list가 담고 있는 스테이지 갯수만큼 실행
                stageFailureRate[k] = failureTree.lastEntry().getValue().get(j);            // 실패율을 갖고 있는 list 배열로 옮기기
                k++;
            }
            failureTree.pollLastEntry();                                                    // 실패율 옮긴 후 다음 높은 실패율 추출을 위한 삭제
        }

        return stageFailureRate;
    }
}
