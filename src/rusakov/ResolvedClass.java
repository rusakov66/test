package rusakov;
import java.util.Scanner;
public class ResolvedClass {
    public static <string> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = in.nextLine();
        Task1 t1 = new Task1();
        System.out.println(t1.calc(str));

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input number of stairs: ");
        int  num;
        num = in2.nextInt();
        Task2 t2 = new Task2();
        String str3 = t2.Task2(num);

        // System.out.println(str3);


    }
}
