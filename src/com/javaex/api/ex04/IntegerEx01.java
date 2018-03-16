package com.javaex.api.ex04;

public class IntegerEx01 {


    public static void main(String[] args) {

        Integer i = new Integer(10);
        Short s = new Short((short)3);
        Byte b = new Byte((byte)3);

        Integer result = new Integer(10) + new Integer(3);
        System.out.println(result);

        Integer i01 = 10;

        int i02 = Integer.parseInt("557789");  //문자열을 숫자로 바꿈
        System.out.println(i01);
        System.out.println(i02);

        String  str = String.valueOf(55555); //숫자를 문자열로 바꿈
        System.out.println(str);

        String str2 = "" + 666; //숫자를 문자열로 바꾸는방법2 더 많이씀
        System.out.println(str2);

        String s01 = "hi";
        String intputText = "hi";
        if ("hi".equals(s01)) { // 변수대신 문자열이 직접와도 됨 (변수가 null이 될 수도 있기때문에 예외가 안날수있게하기 위해)
            System.out.println(123);
        }
    }
}
