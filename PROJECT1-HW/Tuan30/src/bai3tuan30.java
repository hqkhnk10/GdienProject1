package Tuan30.src;

import java.util.Scanner;

public class bai3tuan30 {
    public static int n;

    public static double giaithua(int n) {
        double tmp = 1;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                tmp *= i;
            }
        }
        return tmp;
    }

    public static float result(float n) {
        float tong = 0.0f;
        float denominator = 0;

        for (int i = 1; i <= n; i++) {
            denominator += giaithua(i);
            tong += 1 / denominator;
        }
        return tong;
    }

    public static void main(String[] args) {
        float tong = 0.0f;
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Nhap so tu nhien N = ");
            n = reader.nextInt();
        }

        System.out.println("tong day so la: " + tong);
    }
}