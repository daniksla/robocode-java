package com.context.papa123;

public class Car {

    private String mark;
    private String type;
    private int lkm;
    private int fuel;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLkm() {
        return lkm;
    }

    public void setLkm(int lkm) {
        this.lkm = lkm;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void go(int km) {
        int d = km /100 * lkm;
        if (d > fuel) {
            System.out.println("ERROR: NIKUDA NE EDEM! ne hvataet benzina!");
            return;
        }
        System.out.println("potratili topliva = " + d);
        this.fuel = fuel - d;
    }
}
