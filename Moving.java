package lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        int sumBox = 0;
        int space = width * length * height;

        while(!command.equals("Done")){
            int boxes = Integer.parseInt(command);
            sumBox += boxes;
            if(space < sumBox){
                space -= sumBox;
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
                break;
            }
            command = scan.nextLine();
        }
        if(space > sumBox || command.equals("Done")) {
            int leftCubic = space - sumBox;
            System.out.printf("%d Cubic meters left.", leftCubic);
        }
    }
}
