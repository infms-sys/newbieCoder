package lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int minNum = Integer.MAX_VALUE;

        while(!input.equals("Stop")){
            int n = Integer.parseInt(input);
            if(n < minNum){
                minNum = n;
            }
            input = scan.nextLine();
        }
        System.out.println(minNum);
    }
}

