package exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = Double.parseDouble(scan.nextLine());
        double sumInSt = Math.floor(sum * 100);
        int countCoins = 0;

        while (sumInSt > 0) {
            if (sumInSt >= 200) {
                sumInSt -= 200;
                countCoins++;
            } else if (sumInSt >= 100) {
                sumInSt -= 100;
                countCoins++;
            } else if (sumInSt >= 50) {
                sumInSt -= 50;
                countCoins++;
            } else if (sumInSt >= 20) {
                sumInSt -= 20;
                countCoins++;
            } else if (sumInSt >= 10) {
                sumInSt -= 10;
                countCoins++;
            } else if (sumInSt >= 5) {
                sumInSt -= 5;
                countCoins++;
            } else if (sumInSt >= 2) {
                sumInSt -= 2;
                countCoins++;
            } else if (sumInSt >= 1) {
                sumInSt -= 1;
                countCoins++;
            }
        }
        System.out.println(countCoins);
    }
}
