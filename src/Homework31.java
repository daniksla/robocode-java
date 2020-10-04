import java.util.Scanner;

public class Homework31 {
    public static void main(String[] args) {

        System.out.println("введите числа");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (x > i) {
            System.out.println(x);
        } else {
            System.out.println(i);
        }
    }
}
