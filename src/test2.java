import java.util.*;

public class test2 {


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

        System.out.println("введите число");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        int num = 0;
        boolean numline = false;
        for (int line = 0; line < s; line++) {
            for (int col = 0; col < d; col++) {
                if (a[line][col] == scan) {
                    numline = true;
                }
            }
           if(numline==true){
               num++;
           }
           numline=false;
        }


        System.out.println(5-num);
    }
}
