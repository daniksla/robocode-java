
import java.util.Arrays;
import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner ds =new Scanner(System.in);
        int e = ds.nextInt();
        int[]a =new int[e];
        for (int i = 0; i < e; i++) {
            a[i]=ds.nextInt();



        }
        for (int i = 0; i < e; i++) {

            if(a[i]%2==0){
                System.out.print(" "+a[i]);
            }

        }


    }
}
