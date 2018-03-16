package com.javaex.api.ex03;

public class StringApp01 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        s1 = "hello!";

        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
    }
}
