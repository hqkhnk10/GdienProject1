package Tuan30.src;

import java.util.Scanner;

public class bai4tuan30 {
    public static void main(String args[]) {
        int n;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("n = ");
                n = sc.nextInt();
            } while (n <= 0);
        }
        // print out the Fibonacci
        System.out.format("%dth Fibonacci is: %d", n, fibo(n));

    }

    public static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return (fibo(n - 2) + fibo(n - 1));
        }
    }
}