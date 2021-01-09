
import java.util.Random;
public class Lesson12 {
    public static void main(String[] args) {
Random randon = new Random();
int [][]d = new int[10][10];
int max;
int min;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                d[i][i]=randon.nextInt(100);

            }

        }
        print(d);
max=d[0][0];
min=d[0][0];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if(d[i][i]>max){
                max=d[i][i];
                }
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }

    public static void print(int[][]d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                System.out.println(d[i][i]+"\t");
            }
            System.out.println();
        }
    }
}
