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

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time for alarm in this format (HH:MM): ");
        setAlarm(sc.nextLine());

         if (alarm.isBefore(now)) {
            System.out.println("Alarm is set for tomorrow!");
        } else if(alarm.isAfter(now)) {
             System.out.println("I'll wake you up later!");
         }
    }

    public static void main(String[] args) {
        Monday monday = new Monday();
        monday.setAlarm("08:00");
        monday.showAlarm();
    }
}


