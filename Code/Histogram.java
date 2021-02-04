package exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int p1 = 0;   // <200
        int p2 = 0;  // < 400
        int p3 = 0;  // < 600
        int p4 = 0;  // < 800
        int p5 = 0;  // > 800

        for(int i = 1 ; i <= n; i++){
            int countNum = Integer.parseInt(scan.nextLine());
            if(countNum < 200){
                p1++;
            }else if(countNum < 400){
                p2++;
            } else if(countNum < 600){
                p3++;
            }else if(countNum < 800){
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f%%%n", 1.0 * p1 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * p2 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * p3 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * p4 / n * 100);
        System.out.printf("%.2f%%", 1.0 * p5 / n * 100);
    }
}
