package exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int sumSteps = 0;

        while(!command.equals("Going home")){
            int steps = Integer.parseInt(command);
            sumSteps += steps;
            if(sumSteps >= 10000){
                break;
            }
            command = scan.nextLine();
            }
            if(command.equals("Going home")){
                int stepsHome = Integer.parseInt(scan.nextLine());
                sumSteps += stepsHome;
        }
        if(sumSteps >= 10000){
            System.out.println("Goal reached! Good job!");
            System.out.println(sumSteps - 10000 + " " + "steps over the goal!");
        } else {
            System.out.println(10000 - sumSteps + " " + "more steps to reach goal.");
        }
    }
}
