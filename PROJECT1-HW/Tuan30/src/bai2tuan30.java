package Tuan30.src;

import java.util.Scanner;

public class bai2tuan30 {
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

        for (int i = 1; i <= n; i++) {
            tong += 1 / giaithua(i);
        }
        return tong;
    }

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Nhập số tự nhiên N = ");
            n = reader.nextInt();
        }
    }
}