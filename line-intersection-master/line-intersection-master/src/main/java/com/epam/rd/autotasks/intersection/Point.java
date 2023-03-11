package com.epam.rd.autotasks.intersection;

public class Point {
    public static int x;
    private static int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Point.x = x;
    }

    public int getY() {
        return y;
    }

    public static void setY(int y) {
        Point.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}
