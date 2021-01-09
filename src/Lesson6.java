import  java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner g = new Scanner(System.in);
        Scanner f = new Scanner(System.in);
        System.out.println("введите числа");
        int a = s.nextInt();
        String operator=f.nextLine();
        int d = g.nextInt();

if (operator.equals("+")){System.out.println( suma(a,d) );}
if (operator.equals("-")){System.out.println( min(a,d) );}
if (operator.equals("*")){System.out.println( umn(a,d) );}
if (operator.equals("/")){System.out.println( del(a,d) );}
    }

    public static int suma(int x,int y){
        return x+y;
    }

    public static int min(int x,int y){
        return x-y;
    }

      public static int umn(int x,int y){ return x*y; }

    public static int del(int x,int y){
        return x/y;
    }

}
