package lab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int price = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                price = 12;
                System.out.println(price);
                break;
            case "Wednesday":
            case "Thursday":
                price = 14;
                System.out.println(price);
                break;
            case "Saturday":
            case "Sunday":
                price = 16;
                System.out.println(price);
                break;
        }
    }
}
