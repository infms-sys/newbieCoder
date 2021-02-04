package exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double apartmentPrice = 0;
        double studioPrice = 0;

        switch (month){
            case "May":
            case "October":
                apartmentPrice = 65 * nights;
                studioPrice = 50 * nights;
                if(nights > 7 && nights <= 14){
                    studioPrice *= 0.95;
                } else if(nights > 14){
                    apartmentPrice *= 0.90;
                    studioPrice *= 0.70;
                }
                break;

            case "June":
            case "September":
                apartmentPrice = 68.70 * nights;
                studioPrice = 75.20 * nights;
                if(nights > 14){
                    apartmentPrice *= 0.90;
                    studioPrice *= 0.80;
                }
                break;

            case "July":
            case "August":
                apartmentPrice = 77 * nights;
                studioPrice = 76 * nights;
                if(nights > 14){
                    apartmentPrice *= 0.90;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv. %n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
