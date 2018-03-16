package com.javaex.api.ex02;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Rectangle r) {
        if (width*height == r.width * r.height) {
            return true;
        }else {
            return false;
        }
    }
}
