package com.company.oop;

public class Bedroom {
    private int height;
    private int width;
    private int depth;
    private Bed bed;
    private Dresser dresser;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public Bed getBed() {
        return bed;
    }

    public Bedroom(int height, int width, int depth, Bed bed, Dresser dresser) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.bed = bed;
        this.dresser = dresser;
    }
    public Dresser getDresser() {
        return dresser;
    }
    public void makeBed() {
        System.out.println("Making the bed tidy.");
        bed.make();
    }
}
