package com.company.oop;

public class Bed {
    private int width;
    private int height;
    private int depth;
    private boolean wooden;

    public Bed(int width, int height, int depth, boolean wooden) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.wooden = wooden;

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
    public boolean isWooden() {
        return wooden;
    }
    public void make() {
        System.out.println("Made the bed tidy");
    }

}
