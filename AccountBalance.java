package lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double totalMoney = 0;

        while(!input.equals("NoMoreMoney")){
            double money = Double.parseDouble(input);
            if(money < 0){
                System.out.println("Invalid operation!");
                break;
            }
            totalMoney += money;
            System.out.printf("Increase: %.2f%n", money);
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}
