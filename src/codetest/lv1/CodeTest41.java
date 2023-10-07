package codetest.lv1;
// 프로그래머스 1레벨 - 핸드폰 번호 가리기
public class CodeTest41 {
    public String solution(String phone_number) {
     String str = "*".repeat(new StringBuilder(phone_number).substring(0,phone_number.length()-4).length());
     str += new StringBuilder(phone_number).substring(phone_number.length()-4,phone_number.length());
     return str;
    }
}
