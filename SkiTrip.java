package lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String grade = scan.nextLine();
        int nights = days - 1;
        double totalPrice = 0.0;

        double price = 0.0;

        switch (type){
            case "room for one person":
                price = 18;
                totalPrice = nights * price;
                break;

            case "apartment":
                price = 25;
                totalPrice = nights * price;
                if(nights < 10){
                    totalPrice *= 0.70;
                } else if(nights <= 15){
                    totalPrice *= 0.65;
                } else {
                    totalPrice *= 0.50;
                }
                break;

            case "president apartment":
                price = 35;
                totalPrice = nights * price;
                if(nights < 10){
                    totalPrice *= 0.90;
                } else if(nights <= 15){
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.80;
                }
                break;
        }
        if(grade.equals("positive")){
            totalPrice *= 1.25;
        } else {
            totalPrice *= 0.90;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
