package exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        boolean salaryFinish = false;

        for (int i = 1; i <= tabs; i++) {
            String currentTab = scan.nextLine();

            switch (currentTab) {
                case "Facebook":  // -150 lv
                    salary -= 150;
                    break;

                case "Instagram":  // -100 lv
                    salary -= 100;
                    break;

                case "Reddit":  // -50 lv
                    salary -= 50;
                    break;
            }
            if(salary <= 0){

                salaryFinish = true;
                break; // stop for loop
            }
        }
        if(salaryFinish){
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
