package Tuan31;

import java.util.ArrayList;
import java.util.Scanner;

public class bai3 {

    public static String result(String intArr) {
        ArrayList<Integer> listArr = new ArrayList<Integer>();
        String[] strArray = null;
        // converting using String.split() method with whitespace as a delimiter
        strArray = intArr.split(" ");
        int num = strArray.length;

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        int minArr = min(arr, num);
        listArr.add(minArr);
        for (int i = 0; i < num; i++) {
            if (arr[i] == minArr) {
                listArr.add(i);
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

            int minArr = min(array, num);
            String minIdx = "";
            for (i = 0; i < num; i++) {
                if (array[i] == minArr) {
                    minIdx += (i + 1) + " ";
                }
            }

            System.out.println("Phan tu nho nhat trong mang la: " + minArr +
                    "\nCac chi so ung voi gia tri nho nhat la: " + minIdx);
        }
    }

    public static int min(int a[], int n) {
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
}