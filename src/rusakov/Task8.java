package rusakov;

import java.util.Scanner;
// Given an integer n, determine all prime numbers smaller than n

public class Task8 {
    public void task8() {
        int nn = 0;
        System.out.print("Введите число N: ");
        Scanner in9 = new Scanner(System.in);
        nn = in9.nextInt();
        boolean fl2;
        for (int n = 3; n <= nn; n = n + 1) {
            fl2 = true;
            for (int i = 3; i < n; i = i + 1) {
                if (n % i == 0) {
                    fl2 = false;
                    break;
                }
            }
            if (fl2) {
                System.out.println(n + " : число простое");
            }
        }
    }
}