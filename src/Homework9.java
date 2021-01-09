import java.util.Arrays;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        System.out.println("введите длинну масива");
        Scanner ds = new Scanner(System.in);
        int length = ds.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("введите элемент масива № " + i);
            int b = ds.nextInt();
            arr[i] = b;
        }
        System.out.println(Arrays.toString(arr));
    }
}