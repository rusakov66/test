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
            System.out.println("Task 4 - Sorting array bubble method ");
            System.out.println("Task 5 - Given an array of integers, determine the sum of odd numbers and the amount of even numbers ");
            System.out.println("Task 6 - Given an integer n, determine the number pi with an error less than n decimal places");
            System.out.println("Task 7 - Get random array while and check if it is magical square or not");
            System.out.println("Task 8 - Given an integer n, determine all prime numbers smaller than n");
            System.out.println("Task 9 - Given an integer n, determine all friendly number pairs smaller than n");
            System.out.println("Task 10 - Write a program that outputs the next k leap years");
            System.out.println("Input 0 for exit or number of task to run:");
            inp = in3.nextLine();
            try {
                choise = Integer.valueOf(inp);
            } catch (NumberFormatException e) {
                System.err.println("Wrong input!");
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
                case 4: {
                    Task4 t4 = new Task4();
                    t4.sort_buble();
                }
                break;
                case 5: {
                    Task5 t5 = new Task5();
                    t5.calc_array();
                }
                break;
                case 6: {
                    Task6.calc_pi();
                    /*Task6 t6 = new Task6();
                    t6.calc_pi();*/
                }
                break;
                case 7: {
                    Task7 aut = new Task7();
                    aut.task7();
                }
                break;
                case 8: {
                    Task8 t8 = new Task8();
                    t8.task8();
                }
                break;
                case 9: {
                    Task9 t9 = new Task9();
                    t9.task9();
                }
                break;
                case 10: {
                    Task10 t10 = new Task10();
                    t10.task10();
                }
                break;
            }
        } while (choise != 0);
        System.out.print("Program terminated");
    }
}
