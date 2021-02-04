package exercises;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int p1 = 0; // p1 % 10 == 2;
        int p2 = 0; // p2 % 10 == 3;
        int p3 = 0; // p3 % 10 == 4;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number % 2 == 0) {
                p1++;
            }
            if (number % 3 == 0) {
                p2++;
            }
            if (number % 4 == 0) {
                p3++;
            }
        }
        System.out.printf("%.2f%%%n", p1 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p2 * 1.0 / n * 100);
        System.out.printf("%.2f%%", p3 * 1.0 / n * 100);
    }
}
