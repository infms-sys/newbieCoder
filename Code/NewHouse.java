package exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowerType = scan.nextLine();
        int countFlower = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double price = 0;


        switch (flowerType) {
            case "Roses": // 5 lv.
                price = countFlower * 5;
                if (countFlower > 80) {
                    price *= 0.90;
                }
                break;

            case "Dahlias": // 3.80 lv.
                price = countFlower * 3.80;
                if (countFlower > 90) {
                    price *= 0.85;
                }
                break;

            case "Tulips": // 2.80 lv.
                price = countFlower * 2.80;
                if (countFlower > 80) {
                    price *= 0.85;
                }
                break;

            case "Narcissus": // 3 lv.
                price = countFlower * 3;
                if (countFlower < 120) {
                    price *= 1.15;
                }
                break;

            case "Gladiolus": // 2.50 lv.
                price = countFlower * 2.50;
                if (countFlower < 80) {
                    price *= 1.20;
                }
                break;
        }
        if (budget >= price) {
            double totalSum = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlower, flowerType, totalSum);
        } else {
            double needMoney = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
        }
    }
}
