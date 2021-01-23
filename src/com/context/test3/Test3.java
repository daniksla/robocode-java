package com.context.test3;


public class Test3 {
    public static void main(String[] args) {
        Pupil danik =new Pupil();
        danik.setName("Danik");
        danik.setSurname("Slastin");
        danik.setAge(10);
        danik.setVaccine(false);

        System.out.println("Danik object before vaccination = " + danik);
        danik.vaccinePupil();
        System.out.println("Danik object after vaccination = " + danik);

        System.out.println("Danik's name= " + danik.getName());
        System.out.println("Danik's surname= " + danik.getSurname());
        System.out.println("Danik's age= " + danik.getAge());
        System.out.println("Danik's vaccine= " + danik.getVaccine());

    }
}
