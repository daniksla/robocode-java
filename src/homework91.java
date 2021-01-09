import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

public class homework91 {
    public static void main(String[] args) {


        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int n = r.nextInt(10);
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
        Scanner ds = new Scanner(System.in);
        int t = ds.nextInt();
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == t) {
                counter++;
                arr[i] = 0;
            }

        }
        System.out.println("счетчик");
        System.out.println(counter);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.println("сортировка по убыванию");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.println("сортировка по возрастанию");
        System.out.println(Arrays.toString(arr));
    }
}