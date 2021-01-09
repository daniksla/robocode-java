import java.util.Scanner;

public class papa {
    public static void main(String[] args) {
        boolean star=true;
        int stars = 0;
        char t = '*';
        int s = 3;
        int d = 3;
        int suma = 0;
        char[][] a = new char[s][d];

        for (int line = 0; line < s; line++) {
            for (int col = 0; col < d; col++) {
                a[line][col] = t;
            }
        }


        Scanner scanner = new Scanner(System.in);


        while (star) {

            for (int line = 0; line < s; line++) {
                for (int col = 0; col < d; col++) {
                    System.out.print(a[line][col] + " ");
                }
                System.out.println();
            }
            System.out.println("введидите числа:");
            int scan = scanner.nextInt();
            int scan1 = scanner.nextInt();
            a[scan][scan1]='0';
            //System.out.println("введите еще раз:");
            for (int line = 0; line < s; line++) {
                for (int col = 0; col < d; col++) {
                    if (a[line][col]=='0'){
                        stars++;
                    }

                }
            }
            if (stars==8){
                star=false;
            }


        }


    }
}
