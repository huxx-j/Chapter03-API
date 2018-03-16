package com.javaex.api.ex03;

public class StringApp02 {
    public static void main(String[] args) {

        String a = new String(" ABCD");
        String b = new String(", EFG ");

        a = a.concat(b); // 두 문자열 붙이기
        System.out.println(a);

        a = a.trim(); // 문자열 앞뒤 공백제거
        System.out.println(a);

        a = a.replace("AB", "12"); // 문자열 바꾸기
        System.out.println(a);

        String[] s = a.split(","); // 문자열을 입력한 문자를 기준으로 나눠서 배열로 저장
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        String str = "Hello Java!";
        String r01 = str.substring(3); // 주어진 인덱스부터 출력
        System.out.println(r01);
    }
}
