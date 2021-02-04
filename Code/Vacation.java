package exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyTrip = Double.parseDouble(scan.nextLine());
        double ownedMoney = Double.parseDouble(scan.nextLine());
        int countDays = 0;
        double spendCount = 0;

        while (ownedMoney < moneyTrip && spendCount < 5){
            String command = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            countDays++;

            if(command.equals("save")){
                ownedMoney += money;
                spendCount = 0;
            } else if(command.equals("spend")){
                ownedMoney -= money;
                spendCount += 1;
                if(ownedMoney < 0){
                    ownedMoney = 0;
                }
            }
        }

        if(spendCount == 5){
            System.out.printf("You can't save the money.%n%s", countDays);
        }
        if(ownedMoney >= moneyTrip) {
            System.out.printf("You saved the money for %s days.", countDays);
        }
    }
}
