import java.util.Random;

public class test1 {



        public static void main(String[] args) {
            int s=10;
            int d=10;
            int q =0;
            int[][] a =new int[s][d];
            Random r =new Random();

            for (int line = 0; line < s; line++) {
                for (int col = 0; col < d; col++) {
                    a[line][col]=r.nextInt(10);
                }
            }
            for (int line = 0; line < s; line++) {
                for (int col = 0; col < d; col++) {
                    System.out.print(a[line][col] + " ");
                    if (s == d) {
                        q = q + a[line][col];
                    }
                }
                System.out.println();

            }
            System.out.println(q);


        }
    }

