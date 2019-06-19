package rusakov;
// Given an integer n, determine the number pi with an error less than n decimal places
import java.util.Scanner;
public class Task6 {

    public  static void calc_pi () {
        Double t;// точность
        Double p; //значение пи
        Double n; // число членов ряда
        Double chr; // значение члена ряда
        chr = 1.0D;
        n = 1.0D;
        p = 0.0D;
        System.out.print("Задайте точность вычисления ПИ -> ");
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextDouble();
        System.out.println(t);
        while (t < Math.abs(chr)) {
            p += chr;
            chr = ((Math.pow(-1,  n)) * (1 / ((2 * n) + 1)));
            n++;
        }
        p = p * 4;

        System.out.printf("Значение числа ПИ с точностью %1.12f равно %1.12f\n", t, p);

        System.out.println("Количество членов ряда " + n);
        System.out.printf(" %3.6f\n ", chr);


    }

}
