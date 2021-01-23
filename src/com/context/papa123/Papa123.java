package com.context.papa123;

import java.util.Scanner;

public class Papa123 {
    public static void main(String[] args) {

        Car skoda = new Car();

        skoda.setLkm(8);
        skoda.setFuel(45);
        skoda.setType("octavia");
        skoda.setMark("skoda");

        System.out.println("skolko exat?");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int km = x;
        skoda.go(km);
        System.out.println("posle poestki ost topliva=" + skoda.getFuel());
    }
}
