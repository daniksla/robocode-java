import java.util.Scanner;
import java.util.Random;
public class Homework12 {
    public static void main(String[] args) {

Scanner random=new Scanner(System.in);
    int T_1_x = random.nextInt();
    int T_1_y = random.nextInt();
    int T_2_x = random.nextInt();
    int T_2_y = random.nextInt();
    int [][]arr = new int[10][10];
System.out.println("T1 (" + T_1_x + ";" + T_1_y + ")");
System.out.println("T2 (" + T_2_x + ";" + T_2_y + ")");
for (int i = 0; i < arr.length; i++) {
        arr[i][T_1_y]++;
    }
for (int i = 0; i < arr.length; i++) {
        arr[T_1_x][i]++;
    }
for (int i = 0; i < arr.length; i++) {
        arr[i][T_2_y]++;
    }
for (int i = 0; i < arr.length; i++) {
        arr[T_2_x][i]++;
    }
    //print(arr);
    boolean flag = false;
for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[i][j] == 3) {
                flag = true;
            }
        }
    }
if (flag == true) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
}
}
