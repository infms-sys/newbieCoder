package exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int countFishers = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (season){
            case "Spring":
                price = 3000;
                break;

            case "Summer":
            case "Autumn":
                price = 4200;
                break;

            case "Winter":
                price = 2600;
                break;
        }
        if(countFishers <= 6){
            price *= 0.90;
        } else if(countFishers <= 11){
            price *= 0.85;
        } else if (countFishers >= 12){
            price *= 0.75;
        }
        if(!season.equals("Autumn") && countFishers % 2 == 0){
            price *= 0.95;
        }
        if(budget >= price){
            double leftMoney = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            double needMoney = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needMoney);
        }
    }
}
