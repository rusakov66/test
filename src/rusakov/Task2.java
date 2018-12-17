package rusakov;

import java.util.Scanner;

// Drawing a staircase structure - given the required height, output a staircase as shown in the example
// Given n = 3, the output should be:
// #
// ##
// ###
public class Task2 {

    public void stairs() {
        String str2;
        Scanner in2 = new Scanner(System.in);
        System.out.print("Input number of stairs:");
        int num;
        num = in2.nextInt();
        Task2 t2 = new Task2();
        str2 = "";
        for (int i = 1; i <= num; i = i + 1) {
            str2 = str2 + "#";
            System.out.println(str2);
        }
    }
}
