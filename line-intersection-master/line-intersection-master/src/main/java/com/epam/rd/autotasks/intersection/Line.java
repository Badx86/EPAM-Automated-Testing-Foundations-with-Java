package com.epam.rd.autotasks.intersection;

public class Line {
    private final int k;
    private final int b;
    public int x;
    public int y;
    public Line (int k, int b) {
        this.k = k;
        this.b = b;
        this.x = Point.x;
        this.y = k * this.x + b;
    }

    public Point intersection(Line other) {
        if (k != other.k) {
            int x1 = -(b - other.b) / (k - other.k);
            int y1 = -other.k * (b - other.b) / (k - other.k) + other.b;
            Point Pi = new Point (x1, y1);
            return Pi;
        }
        else if ((k == other.k) && (b == other.b)) {
            return null;
        }
        else if (k == other.k) {
            return null;
        }
    return null;
    }

}
