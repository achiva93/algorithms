package com.lseg.teme.Homework6;

public class Point {
    int x;
    int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(Point b){
        return Math.sqrt((b.getX() - this.getX()) * (b.getX() - this.getX()) + (b.getY() - this.getY()) * (b.getY() - this.getY()));
    }
}
