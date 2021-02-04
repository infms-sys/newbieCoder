package lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = scan.nextLine();

        String currentTry = scan.nextLine();

        while(!currentTry.equals(password)){
            currentTry = scan.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
