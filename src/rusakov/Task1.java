package rusakov;

import java.util.Scanner;

// Given a string of characters, determine if it is a palindrome or not
public class Task1 {
    public void calc() {
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Input palindrom string: ");
        String str = in.nextLine();
        for (int i = 0; i <= (str.length() / 2) - 1; i = i + 1) {
            System.out.print(str.charAt(i));
            System.out.print("--");
            System.out.println(str.charAt(str.length() - 1 - i));
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                flag = flag;
            } else {
                flag = flag & false;
            }
        }
        if (flag) str = "Polindrom";
        else str = "Non polindrom";
        System.out.println(str);
    }
}