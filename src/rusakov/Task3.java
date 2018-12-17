package rusakov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// Given an array of floating point numbers, inverse the elements of the array
public class Task3 {
    public void sort_arr() {
        ArrayList<Float> arr = new ArrayList<>();
        Scanner in4 = new Scanner(System.in);
        System.out.print("Input length of array:");
        int len;
        len = in4.nextInt();
        for (int j = 0; j < len; j = j + 1) {
            Scanner in5 = new Scanner(System.in);
            System.out.print("Input element of array:");
            arr.add(in5.nextFloat());
        }
        for (int i = 0; i <= (len / 2) - 1; i = i + 1) {
            Collections.swap(arr, i, len - i - 1);
        }
        System.out.println("Inversed array:");

        for (int i = 0; i < len; i = i + 1) {
            System.out.println(arr.get(i));
        }
    }
}