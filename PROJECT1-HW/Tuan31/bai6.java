package Tuan31;

import java.util.ArrayList;
import java.util.Scanner;

public class bai6 {
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
            for (int j = 0; j < num; j++) {
                try {
                    if (arr[i] % arr[j] == 0 && arr[j] > 1 && arr[j] < arr[i]) {
                        listArr.add(arr[j]);
                        arr[j] = 0;
                    }
                } catch (ArithmeticException e) {
                }

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

            System.out.println("Uoc thuc su cua 1 so hang khac trong day tren: ");

            for (i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    try {
                        if (array[i] % array[j] == 0 && array[j] > 1 && array[j] < array[i]) {
                            System.out.print(array[j] + " ");
                            array[j] = 0;
                        }
                    } catch (ArithmeticException e) {
                    }

                }
            }
        }

    }

}