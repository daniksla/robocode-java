import java.util.Scanner;
import java.util.Random;

public class Homework3 {
    public static void main (String[] args){

        System.out.println("введите максимальное");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();

        System.out.println("введите минимальное");
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();

        Random rand =new Random();
        int q = rand.nextInt(max  - min) + min;
        System.out.println(q);

        Random randw =new Random();
        int w = randw.nextInt(max  - min) + min;
        System.out.println(w);

        Random randww =new Random();
        int e = randww.nextInt(max  - min) + min;
        System.out.println(e);

        Random randr =new Random();
        int r = randr.nextInt(max  - min) + min;
        System.out.println(r);

        Random randrr =new Random();
        int t = randrr.nextInt(max  - min) + min;
        System.out.println(t);




    }
}

