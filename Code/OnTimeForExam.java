package exercises;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int examHour = Integer.parseInt(scan.nextLine());
        int examMinute = Integer.parseInt(scan.nextLine());
        int arriveHour = Integer.parseInt(scan.nextLine());
        int arriveMinute = Integer.parseInt(scan.nextLine());

        int examHourTime = (examHour * 60) + examMinute;
        int arriveHourTime = (arriveHour * 60) + arriveMinute;

        if(arriveHourTime > examHourTime){
            //Late
            System.out.println("Late");
            int lateMinutes = arriveHourTime - examHourTime;
            if(lateMinutes < 60){
                System.out.printf("%d minutes after the start", lateMinutes);
            } else {
                int hour = lateMinutes / 60;
                int minutes = lateMinutes % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }

        } else if(arriveMinute == examHourTime || examHourTime - arriveHourTime <= 30){
            // On Time
            System.out.println("On time");
            if(examMinute - arriveMinute <= 30 && arriveMinute != examMinute){
                System.out.printf("%d minutes before the start", examHourTime - arriveHourTime);
            }

        }else if (examHourTime - arriveHourTime > 30){
            // Early
            System.out.println("Early");
            int earlyMinutes = examHourTime - arriveHourTime;
            if(earlyMinutes < 60){
                System.out.printf("%d minutes before the start", earlyMinutes);
            } else {
                int hour = earlyMinutes / 60;
                int minutes = earlyMinutes % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }
    }
}
