package rusakov;

import java.util.Scanner;

public class ResolvedClass {
    public static void main(String[] args) {
        // Main
        int choise = 0;
        String inp;
        Scanner in3 = new Scanner(System.in);
        do {
            System.out.println("Task 1 - Given a string of characters, determine if it is a palindrome or not  ");
            System.out.println("Task 2 - Drawing a staircase structure - given the required height  ");
            System.out.println("Task 3 - Given an array of floating point numbers, inverse the elements of the array ");
            System.out.println("Input 0 for exit or number of task to run:");
            inp = in3.nextLine();
            try {
                choise = Integer.valueOf(inp);
            } catch (NumberFormatException e) {
                System.err.println("Wrong input!");
                choise = 12;
                continue;
            }
            switch (choise) {
                case 1: {
                    Task1 t1 = new Task1();
                    t1.calc();
                }
                break;
                case 2: {
                    Task2 t2 = new Task2();
                    t2.stairs();
                }
                break;
                case 3: {
                    Task3 t3 = new Task3();
                    t3.sort_arr();
                }
                break;
            }
        } while (choise != 0);
        System.out.print("Program terminated");
    }
}
