package rusakov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Task4 {
    public void sort_buble() {
        ArrayList<Integer> arr2 = new ArrayList<>();
        Scanner in7 = new Scanner(System.in);
        System.out.print("Input length of array:");
        int len;
        len = in7.nextInt();
        for (int j = 0; j < len; j = j + 1) {

            arr2.add((int) (Math.random() * 1000));
        }
        for (int j = 0; j < len; j++) {
            int f = 0;
            for (int i = j + 1; i < len; i = i + 1) {
                if (arr2.get(i) > arr2.get(j)) {
                    Collections.swap(arr2, i, j);
                    System.out.println();
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < len; i = i + 1) {
            System.out.print(arr2.get(i) + "  ");
        }
        System.out.println();
    }

}
