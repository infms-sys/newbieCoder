package lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0.0;

        if (town.equals("Sofia") || town.equals("Varna") || town.equals("Plovdiv")) {
            if ("Sofia".equals(town)) {
                if (0 <= quantity && quantity <= 500) {
                    price = quantity * 0.05;
                    System.out.printf("%.2f", price);
                } else if (500 < quantity && quantity <= 1000) {
                    price = quantity * 0.07;
                    System.out.printf("%.2f", price);
                } else if (1000 < quantity && quantity <= 10000) {
                    price = quantity * 0.08;
                    System.out.printf("%.2f", price);
                } else if (quantity > 10000) {
                    price = quantity * 0.12;
                    System.out.printf("%.2f", price);
                } else if(quantity < 0){
                    System.out.println("error");
                }

            } else if ("Varna".equals(town)) {
                if (0 <= quantity && quantity <= 500) {
                    price = quantity * 0.045;
                    System.out.printf("%.2f", price);
                } else if (500 < quantity && quantity <= 1000) {
                    price = quantity * 0.075;
                    System.out.printf("%.2f", price);
                } else if (1000 < quantity && quantity <= 10000) {
                    price = quantity * 0.10;
                    System.out.printf("%.2f", price);
                } else if (quantity > 10000) {
                    price = quantity * 0.13;
                    System.out.printf("%.2f", price);
                } else if (quantity < 0){
                    System.out.println("error");
                }
            } else if ("Plovdiv".equals(town)) {
                if (0 <= quantity && quantity <= 500) {
                    price = quantity * 0.055;
                    System.out.printf("%.2f", price);
                } else if (500 < quantity && quantity <= 1000) {
                    price = quantity * 0.08;
                    System.out.printf("%.2f", price);
                } else if (1000 < quantity && quantity <= 10000) {
                    price = quantity * 0.12;
                    System.out.printf("%.2f", price);
                } else if (quantity > 10000) {
                    price = quantity * 0.145;
                    System.out.printf("%.2f", price);
                } else if (quantity < 0) {
                    System.out.println("error");
                }
            }
        } else {
            System.out.println("error");
        }
    }
}
