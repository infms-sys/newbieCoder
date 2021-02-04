package exercises;

import java.util.Scanner;

public class Jorney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        double discount = 0;

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    discount = budget * 30 / 100;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f", discount);
                } else if (budget <= 1000) {
                    discount = budget * 40 / 100;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", discount);
                } else {
                    discount = budget * 90 / 100;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", discount);
                }
                break;

            case "winter":
                if (budget <= 100) {
                    discount = budget * 70 / 100;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f", discount);
                } else if (budget <= 1000) {
                    discount = budget * 80 / 100;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", discount);
                } else {
                    discount = budget * 90 / 100;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", discount);
                }
                break;
            }
        }
    }

