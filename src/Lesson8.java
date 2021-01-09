import java.util.Arrays;
import java.util.Random;

public class Lesson8 {

    public static void main(String[] args){
        Random r =new Random();
        int []arr =new int[10];
        for (int i = 0; i <arr.length;i++) {
            int f =100;
            arr[i]=r.nextInt(f)-50;

        }
        for (int i = 0; i <arr.length;i++) {
            for (int j = 0; j < arr.length -1; j++) {
            if (arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}



