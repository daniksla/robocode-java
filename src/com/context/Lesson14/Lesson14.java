package com.context.Lesson14;

class StringConverter {
private final String origin;
public StringConverter(String origin) { this.origin = origin; }
public String getOrigin(){ return origin; }
public String deleteAllSpaces(){
        String tmp = origin;
        while (tmp.contains(" "))
        tmp = tmp.replace(" ", "");
        return tmp;
        }
public String[] splitOnWord(){ return origin.split(" "); }
        }



public class Lesson14 {
    public static void main(String[] args) {

        StringConverter StringConverter=new StringConverter("hello werr r rw rw");


    }



}
