import java.util.Random;
import java.util.Scanner;

public class test6 {


    public static void main(String[] args) {
        int s = 5;
        int d = 5;
        int suma = 0;
        int[][] a = new int[s][d];
        Random r = new Random();

        for (int line = 0; line < s; line++) {
            for (int col = 0; col < d; col++) {
                a[line][col] = r.nextInt(10);
            }


        }
        for (int line = 0; line < s; line++) {
            for (int col = 0; col < d; col++) {
                System.out.print(a[line][col] + " ");

            }
            System.out.println();
        }


        int num = 0;
        boolean numline = false;
        for (int line = 0; line < s; line++) {
            for (int col = 0; col < d; col++) {

            }


            System.out.println(5 - num);
        }
    }
}
