import java.util.Scanner;
import java.util.Random;

public class Marafon {
    public static void main(String[] args) {
        {
/*        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int x =a%2;
        if(x == 0){
            System.out.println("четное");
        }
        else {
            System.out.println("нечетное");
        }*/
        }

        /*System.out.println("введите число:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x%7){
            case 1:
                System.out.println("pon"); break;
            case 2:
                System.out.println("vtor"); break;
            case 3:
                System.out.println("sred"); break;
            case 4:
                System.out.println("cetv"); break;
            case 5:
                System.out.println("piat"); break;
            case 6:
                System.out.println("sub"); break;
            case 0:
                System.out.println("vosk"); break;

        }*/
//n6
//        System.out.println("vvedite minimalnoe");
//        Scanner s = new  Scanner(System.in);
//        int n  = s.nextInt();
//
//        System.out.println("vvedite maksimalnoe");
//        Scanner d = new  Scanner(System.in);
//        int v  = d.nextInt();
//
//        for (int i=n;i<=v;i++){
//            System.out.println(i);
//        }


        //n7
//        System.out.println("vvedite minimalnoe");
//        Scanner s = new  Scanner(System.in);
//        int n  = s.nextInt();
//
//        System.out.println("vvedite maksimalnoe");
//        Scanner d = new  Scanner(System.in);
//        int v  = d.nextInt();
//int suma =0;
//        for (int i=n;i<=v;i++){
//            System.out.println(i);
//            suma=suma+i;
//        }
//        System.out.println(suma);
//        }
        System.out.println("vvedite dlinu");
        Scanner s = new Scanner(System.in);
        int dl = s.nextInt();

        System.out.println("vvedite shirinu");
        Scanner d = new Scanner(System.in);
        int sh = d.nextInt();

        for (int j = 0; j < sh; j++) {
            for (int i = 0; i < dl; i++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}

