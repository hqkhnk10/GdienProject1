package Tuan31;

import java.util.Arrays;
import java.util.Scanner;

public class bai1 {

    public static String result(String intArr) {
        // declaring an empty string array
        String[] strArray = null;
        // converting using String.split() method with whitespace as a delimiter
        strArray = intArr.split(" ");
        int num = strArray.length;

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        int temp;

        for (int i = 0; i < (num - 1); i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int num, i, j, temp;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Nhap vao so luong phan tu cua mang:");
            num = input.nextInt();
            int array[] = new int[num];
            System.out.println("Nhap vao cac phan tu cua mang:");
            for (i = 0; i < num; i++)
                array[i] = input.nextInt();

            for (i = 0; i < (num - 1); i++) {
                for (j = 0; j < num - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            System.out.println("Sap xep theo thu tu giam dan la: ");
            for (i = 0; i < num; i++) {
                System.out.print(array[i] + "   ");
            }
        }
    }
}