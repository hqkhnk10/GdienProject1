package Tuan31;

import java.util.ArrayList;
import java.util.Scanner;

public class bai4 {

    
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

        int minArr = max(arr, num);
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
            int maxArr = max(array, num);
            String maxIdx = "";
            for (i = 0; i < num; i++) {
                if (array[i] == maxArr) {
                    maxIdx += (i + 1) + " ";
                }
            }
            System.out.println("Phan tu nho nhat trong mang la: " + maxArr +
                    "\nCac chi so ung voi gia tri nho nhat la: " + maxIdx);
        }
    }

    public static int max(int a[], int n) {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
}