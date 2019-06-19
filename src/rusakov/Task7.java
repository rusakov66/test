package rusakov;
// Get random array while and check if it is magical square or not
// Ask for square size and then init first array like int[] square = new int[%size from input%]

import java.util.Scanner;

public class Task7 {
    int sum = 0;
    int sum1 = 0;
    boolean volsh = true;
    int dim = 0;
    int man = 0;

    public boolean check_magic(int[][] arr4) {
        volsh = true;
        sum = 0;
        sum1 = 0;
        // Check summ by rows
        for (int i = 0; i < dim; i++) {
            int sum = 0;
            for (int j = 0; j < dim; j++) {
                sum = sum + arr4[i][j];
            }
            if (sum != man) {
                volsh = false;
                return volsh;
            }
        }
        // Check summ by columns
        for (int j = 0; j < dim; j++) {
            int sum = 0;
            for (int i = 0; i < dim; i++) {
                sum = sum + arr4[i][j];
            }
            if (sum != man) {
                volsh = false;
                return volsh;
            }
        }
        // Check summ by diags
        for (int i = 0; i < dim; i++) {
            sum = sum + arr4[i][i];
            sum1 = sum1 + arr4[i][dim - i - 1];
        }
        if ((sum != man) || (sum1 != man)) {
            volsh = false;
            return volsh;
        }
        return volsh;
    }
    public void task7() {
        int[] obr = new int[100];
        int s = 0;
        int cho = 0;
        do {
            System.out.println("Input 1 for randomly filled Square");
            System.out.println("Input 2 for manually filled Square");
            System.out.println("Input 3 for automated creation of magic Square");
            Scanner in2 = new Scanner(System.in);
            cho = in2.nextInt();
        } while (cho > 3 || cho < 1);
        do {
            System.out.print("Input dimension of square: (3-4 for auto filling) ");
            Scanner in = new Scanner(System.in);
            dim = in.nextInt();
        }
        while ( (dim > 4 || dim < 3) && cho != 3);
        man = (int) (Math.pow(dim, 3) + dim) / 2;
        System.out.println("Mantissa of array is " + man);
        int[][] arr4 = new int[dim][dim];
        switch (cho) {
            case 1:
            case 3:
                do {
                    // Fill Square auto
                    // Array is a null
                    for (int i = 0; i < dim; i++) {
                        for (int j = 0; j < dim; j++) {
                            arr4[i][j] = 0;
                        }
                    }
                    s = 0;
                    for (int ii = 0; ii < 100; ii++) {
                        obr[ii] = ii;
                    }
                    for (int i = 0; i < dim; i++) {
                        for (int j = 0; j < dim; j++) {
                            while (arr4[i][j] == 0) {
                                s = 1 + (int) (Math.random() * dim * dim);
                                if (obr[s] != 0) {
                                    arr4[i][j] = obr[s];
                                    obr[s] = 0;
                                }
                            }
                        }
                    }
                    check_magic(arr4);
                }
                while (cho == 3 && volsh == false);
                break;
            case 2:
                for (int i = 0; i < dim; i++) {
                    for (int j = 0; j < dim; j++) {
                        System.out.print("Input element [" + i + "," + j + "] of square:  ");
                        Scanner in2 = new Scanner(System.in);
                        arr4[i][j] = in2.nextInt();
                    }
                    System.out.println();
                }
                break;
        } //switch
        check_magic(arr4);
        System.out.println(volsh);
        System.out.println();
        // Print results
        if (volsh) {
            System.out.println("You are lucky! This is a magic square!");
        } else {
            System.out.println(" This is not a magic square!");
        }
        // Print Square
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.printf("%4d", arr4[i][j]);
            }
            System.out.println();
        }
    }
}
