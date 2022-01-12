package eight_handson_activity;

import java.time.LocalTime;
import java.util.Scanner;

public class Monday extends Weekday {

    String time;
    public void setAlarm(String time) {
        this.time = time;
    }

    public void showAlarm() {
        LocalTime alarm = LocalTime.parse(time);
        LocalTime now = LocalTime.now();

         if (alarm.isBefore(now)) {
            System.out.println("Alarm is set for tomorrow!\n");
        } else if(alarm.isAfter(now)) {
             System.out.println("I'll wake you up later!\n");
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Monday monday = new Monday();
        System.out.print("Enter time for alarm in this format (HH:MM): ");
        try {
            String input = sc.nextLine();
            monday.setAlarm(input);
            monday.showAlarm();
        } catch(Exception e ) {
            System.out.println("Invalid input please try again...");
        }


    }
}


