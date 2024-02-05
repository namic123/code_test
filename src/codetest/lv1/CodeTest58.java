package codetest.lv1;

public class CodeTest58{
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length;i++){
            System.out.println("i = " + i);
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("j = " + j);
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
            return answer;
    }
}