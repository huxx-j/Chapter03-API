package com.javaex.api.ex01;

public class PointApp {
    public static void main(String[] args) {

        Point a = new Point(2,3);
        Point b = new Point(2,3);
        Point c = a;

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println();
        System.out.println(a.equals(b));
        System.out.println();
        System.out.println(a.hashCode()); // 객체의 주소를 알수있는 유일한 값(?)
        System.out.println(a.getClass());
        System.out.println(a.getClass().getName());
        System.out.println(a.toString());
        System.out.println(a);
    }
}
