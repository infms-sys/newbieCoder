package exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int degrees = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();
        String shoes = "";
        String shirt = "";

        switch (dayTime){
            case "Morning":
                if(10 <= degrees && degrees <= 18){
                    shirt = "Sweatshirt";
                    shoes = "Sneakers";
                } else if(18 < degrees && degrees <= 24){
                    shirt = "Shirt";
                    shoes = "Moccasins";
                } else if( degrees >= 25){
                    shirt = "T-Shirt";
                    shoes = "Sandals";
                }
                break;

            case "Afternoon":
                if(10 <= degrees && degrees <= 18){
                    shirt = "Shirt";
                    shoes = "Moccasins";
                } else if(18 < degrees && degrees <= 24){
                    shirt = "T-Shirt";
                    shoes = "Sandals";
                } else if( degrees >= 25) {
                    shirt = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;

            case "Evening":
                shirt = "Shirt";
                shoes = "Moccasins";
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, shirt, shoes);
    }
}
