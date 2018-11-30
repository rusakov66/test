package rusakov;
import java.util.Scanner;
public class ResolvedClass {
    public static <string> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = in.nextLine();
        Task1 t1 = new Task1();
        System.out.println(t1.calc(str));
    }
}
/*   branch PROBLEM_1 */
