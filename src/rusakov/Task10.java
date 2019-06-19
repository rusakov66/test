package rusakov;

import java.util.Scanner;
import java.util.Calendar;

// Write a program that outputs the next k leap years
public class Task10 {
    public void task10() {
        Scanner in3 = new Scanner(System.in);
        System.out.print("Input  Year's number: ");
        int k = in3.nextInt();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Current Year = " + currentYear);
        int i = currentYear;
        do {
            if (i%400 == 0) {
                System.out.println("Leap Year: " + i + " (/400)");
                k--;
                i++;
                continue;
            }
            if (i%100 == 0) {
                i++;
                continue;
            }
            if (i%4 == 0) {
                System.out.println("Leap Year: " + i + " (/4)");
                k--;
                i++;
                continue;
            }
            i++;
        }  while (k != 0);
    }



}
