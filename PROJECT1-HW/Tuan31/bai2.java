package Tuan31;

import java.util.ArrayList;
import java.util.Scanner;

public class bai2 {

    public static String result(String intArr) {
        ArrayList<Integer> listArr = new ArrayList<Integer>();
        // declaring an empty string array
        String[] strArray = null;
        // converting using String.split() method with whitespace as a delimiter
        strArray = intArr.split(" ");
        int num = strArray.length;

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        for (int i = 0; i < num; i++) {
            if (check(arr[i])) {
                listArr.add(arr[i]);
            }
        }

        return listArr.toString();
    }

    public static void main(String[] args) {
        int num, i;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Nhap vao so luong phan tu cua mang:");
            num = input.nextInt();
            int array[] = new int[num];
            System.out.println("Nhap vao cac phan tu cua mang:");
            for (i = 0; i < num; i++)
                array[i] = input.nextInt();

            System.out.print("Cac so nguyen to la: ");
            for (i = 0; i < num; i++) {
                if (check(array[i]))
                    System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
    }

    public static boolean check(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        // Nếu không chia hết thì trả về true
        return true;
    }
}