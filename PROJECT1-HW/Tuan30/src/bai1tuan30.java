package Tuan30.src;

import java.util.Scanner;

public class bai1tuan30 {
    public static void main(String[] args) {

        int n;
        float sum;

        Scanner sc;

        System.out.print("Input n = ");
        sc = new Scanner(System.in);
        n = sc.nextInt();
        sum = result(n);

        System.out.println("Sum = " + sum);
        sc.close();
    }

    public static float result(int n) {
        float sum = 0f;
        int denominator = 0;
        for (int i = 1; i <= n; i++) {
            denominator += i;
            sum += 1.0 / denominator;
        }

        return sum;
    }
}
