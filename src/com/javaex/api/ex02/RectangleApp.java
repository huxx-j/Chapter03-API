package com.javaex.api.ex02;

public class RectangleApp {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(6,4);
        Rectangle r2 = new Rectangle(2,12);
        Rectangle r3 = new Rectangle(3,3);
        Rectangle r4 = r3;

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r1.equals(r4));
        System.out.println(r4.equals(r3));
    }
}
