package exercises;

import java.util.Scanner;

public class Voleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String year = scan.nextLine();
        int holidays = Integer.parseInt(scan.nextLine());
        int weekendInHome = Integer.parseInt(scan.nextLine());

        double weekendInSofia = (48 - weekendInHome) * 3.0/4;
        double holidaysGames = holidays * 2.0/3;
        double totalGames = weekendInSofia + weekendInHome + holidaysGames;

        switch (year){
            case "leap":
                totalGames *= 1.15;
                System.out.printf("%.0f", Math.floor(totalGames));
                break;

            case "normal":
                System.out.printf("%.0f", Math.floor(totalGames));
                break;
        }
    }
}
