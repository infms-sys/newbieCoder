package exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int cakePieces = width * length;
        String command = scan.nextLine();
        while(!command.equals("STOP")){
        int pieces = Integer.parseInt(command);
        cakePieces -= pieces;
        if(cakePieces < 0){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
            break;
        }
            command = scan.nextLine();
        }
        if(command.equals("STOP")){
            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}
