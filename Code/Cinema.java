package exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int column = Integer.parseInt(scan.nextLine());

        double income = 0;

        switch (projection){
            case "Premiere":
                income = row * column * 12;
                break;

            case "Normal":
                income = row * column * 7.50;
                break;

            case "Discount":
                income = row * column * 5;
                break;
        }
        System.out.printf("%.2f", income);
    }
}
