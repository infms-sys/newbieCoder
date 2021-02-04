package lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while(!input.equals("Stop")){
            int n = Integer.parseInt(input);
            if(n > maxNum){
                maxNum = n;
            }
            input = scan.nextLine();
        }
        System.out.println(maxNum);
    }
}
