package rusakov;
// Task 11 - Given an integer n, determine all friendly number pairs smaller than n
import java.util.Scanner;

public class Task9 {
    public static long gcm(long a, long b) {
        return b == 0 ? a : gcm(b, a % b);
    }
    public static String asFraction(long a, long b) {
        long gcm = gcm(a, b);
        return (a / gcm) + "/" + (b / gcm); // This method I took from google
    }
    public String num_Analysis(int n) {
        int sum = 0;
        String s = "";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        s = asFraction(sum, n);
        return s;
    }
    public void task9() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input  natural number: ");
        int aa = in.nextInt();
        String[] arr5 = new String[aa + 1];
        int[] arr4 = new int[aa + 1];
        for (int i = 1; i < aa + 1; i++) {
            arr5[i] = num_Analysis(i);
        }
        // Searching for equal valies in array
        for (int i = 1; i <= aa  ; i++) {
            for (int j = i + 1 ; j < aa +1 ; j++) {
                if ( arr5[i].equals(arr5[j]) ) {
                    System.out.println(i + " AND " + j + " - are friendly number: ");
                    System.out.println("  (" + i + " ---> " + arr5[i] + " ,  " +  j + " ---> " + arr5[j] + ")");
                }
            }
        }
    }
}
