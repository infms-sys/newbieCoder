package lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int grade = 1; // започваме от 1ви клас
        double sum = 0;
        int repeatClass = 0;
        boolean isExcluded = false;  // флаг

        while(grade <= 12){
            double currentMark = Double.parseDouble(scan.nextLine());
            if(currentMark < 4){
                repeatClass++;
                if(repeatClass == 2){
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    isExcluded = true; // ако Е изключен
                    break;
                }
                continue;  // ако е true следващите редове няма да се изпълнят, но цикъла ще се върти
            }
            sum += currentMark;
            grade++;
        }
        if(!isExcluded) {  // ако НЕ е изключен
            double avrMark = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avrMark);
        }
    }
}
