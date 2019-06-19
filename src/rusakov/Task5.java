package rusakov;
// Given an array of integers, determine the sum of odd numbers and the amount of even numbers

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public void calc_array() {
        ArrayList<Integer> arr3 = new ArrayList<>();
        Scanner in8 = new Scanner(System.in);
        System.out.print("Input length of array:");
        int len;
        len = in8.nextInt();
        for (int j = 0; j < len; j = j + 1) {
            arr3.add((int) (Math.random() * 1000));
        }
        int sum = 0;
        int num = 0;
        for (int j = 0; j < len; j++) {
            if (((arr3.get(j)) % 2) == 0) {
                num++;
            } else {
                sum = sum + arr3.get(j);
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < len; i = i + 1) {
            System.out.print(arr3.get(i) + "  ");
        }
        System.out.println("Sum of odd numbers: " + sum);
        System.out.println("Number of even numbers: " + num);
    }
}
