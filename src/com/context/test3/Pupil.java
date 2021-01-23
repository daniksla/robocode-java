package com.context.test3;

public class Pupil {
    private String name;
    private String surname;
    private int age;
    private boolean vaccine;

    public String getName(){
        return name;
    }
    public void setName(String nameParam){
        name = nameParam;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surnameParam){
        surname = surnameParam;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int ageParam){
        age = ageParam;
    }

    public boolean getVaccine(){
        return vaccine;
    }
    public void setVaccine(boolean vaccineParam){
        vaccine = vaccineParam;
    }

    public void vaccinePupil() {
        vaccine = true;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Age=" + age +
                ", Vaccine=" + vaccine +
                '}';
    }
}



