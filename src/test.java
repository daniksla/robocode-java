import java.util.*;

public class test {
    public static void main(String[] args) {
        int s=10;
        int d=10;
        int suma =0;
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


                    if (col == line) {
                        suma = suma + a[line][col];
                }

            }
            System.out.println();

        }


        System.out.println(suma);



        //2
        suma=0;
        for (int line = 0; line < s; line++) {
                System.out.print(a[line][9-line] + " ");
                    suma = suma + a[line][9-line];

            System.out.println();

        }
        System.out.println("втор диаг"+suma);

    }
}


