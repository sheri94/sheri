package Kata;

import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;
import java.util.logging.Level;

public class NewTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = arr[j] * x;
            System.out.println(arr[j]);
        }
     //   Test t1 = new Test();
       // t1.priceCalculation(1,2);

    }


}



