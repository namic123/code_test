//package codetest.lv1;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//// 신고 결과 받기
//public class CodeTest10 {
//    public String
//    public String[][] solution(String[] id_list, String[] report, int k) {
//        ArrayList<String> duplicate_reporter = new ArrayList<String>();
//        HashMap<String, Integer> report_map = new HashMap<String, Integer>();
//        String[][] report_list = new String[report.length][2];
//
//        for(String id :id_list){report_map.put(id,0);}
//        for (int i = 0; i < report.length; i++) {
//            for (int j = 0; j < 2; j++) {
//                report_list[i][j] = report[i].split(" ")[j];
//                System.out.println(report_list[i][j]);
//            }
//        }
//        for (int i = 0; i < report_list.length; i++) {
//            if(!(duplicate_reporter.contains(report_list[i][0]+" "+report_list[1]))){
//                report_map.put(report_list[i][1], report_map.get(report_list[1])+1);
//                duplicate_reporter.add(report_list[i][0]+" "+report_list[1]);
//            }
//        }
//        return report_list;
//    }
//
//    public static void main(String[] args) {
//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        CodeTest10 cd = new CodeTest10();
//        cd.solution(id_list,report,3);
//    }
//}
