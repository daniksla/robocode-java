import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        int x = 0;

        int c1000 =1000;
        int c500 =500;
        int c200 =200;
        int c100 =100;
        int c50 =50;
        int c20 =20;
        int c10 =10;
        int c5 =5;
        int c1 =1;


        System.out.println("Введите сумму денег:");
        Scanner scanner = new Scanner(System.in);
        String summaString = scanner.nextLine();
        x = Integer.valueOf(summaString);

        c1000 = x / 1000;
        x = x % 1000;

        c500 = x / 500;
        x = x % 500;

        c200 = x / 200;
        x = x % 200;

        c100 = x / 100;
        x = x % 100;

        c50 = x / 50;
        x = x % 50;

        c20 = x / 20;
        x = x % 20;

        c10 = x / 10;
        x = x % 10;

        c5 = x / 5;
        x = x % 5;

        c1 = x / 1;
        x = x % 1;






        System.out.println("1000 банкнот: " + c1000);
        System.out.println("500 банкнот: " + c500);
        System.out.println("200 банкнот: " + c200);
        System.out.println("100 банкнот: " + c100);
        System.out.println("50 банкнот: " + c50);
        System.out.println("20 банкнот: " + c20);
        System.out.println("10 банкнот: " + c10);
        System.out.println("5 банкнот: " + c5);
        System.out.println("1 банкнот: " + c1);

    }
}
