import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите число");
        int a = s.nextInt();
        for (int i = 0; i < a; i++) {
            if (a % 2==0) {
                smilehappy();
            }
                else{
                smilesad ();

            }

        }

    }

    public static void smilehappy () {
        System.out.println("(:");
    }
    public static void smilesad () {
        System.out.println("):");
    }
}
