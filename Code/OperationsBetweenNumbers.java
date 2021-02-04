package exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        String operation = scan.nextLine();

        switch (operation) {
            case "+":
                int sum = num1 + num2;
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", num1, num2, sum);
                } else {
                    System.out.printf("%d %s %d - odd", num1, operation, num2);
                }
                break;

            case "-":
                int diff = num1 - num2;
                if (diff % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", num1, num2, diff);
                } else {
                    System.out.printf("%d - %d = %d - odd", num1, num2, diff);
                }
                break;

            case "*":
                int square = num1 * num2;
                if (square % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", num1, num2, square);
                } else {
                    System.out.printf("%d * %d = %d - odd", num1, num2, square);
                }
                break;

            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    double division = num1 * 1.0 / num2;
                    System.out.printf("%d / %d = %.2f", num1, num2, division);
                }
                break;

            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    int modul = num1 % num2;
                    System.out.printf("%d %% %d = %d", num1, num2, modul);
                }
                break;
        }
    }
}
