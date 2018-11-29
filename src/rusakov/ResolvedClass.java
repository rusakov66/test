package rusakov;
import java.util.Scanner;
public class ResolvedClass {
    public static <string> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = in.nextLine();
        boolean flag = true;
        /* delaem cikl ot 0 do poloviny dliny stroki */
        for (int i = 0; i <= (str.length() / 2) - 1; i = i + 1) {
            /* Vivodim sravnimuiu paru chisel */
            System.out.print(str.charAt(i));
            System.out.print("--");
            System.out.println(str.charAt(str.length() - 1 - i));
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                flag = flag;
            } else {flag = flag & false;}
        }
        if (flag) {System.out.println("Polindrom");} else {System.out.println("Non polindrom");}
    }
}
/*   branch PROBLEM_1 */
