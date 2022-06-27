package Tuan32;

import java.util.ArrayList;

//NgoQuangTruong-20198265

public class bai5 {
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
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        listArr.add(count0);
        listArr.add(count1);

        return listArr.toString();
    }

    public static void main(String[] args) {
        String zeros = "0 1 0 0 1 1 1 1 0 0 1 0 1 0 1";
        int count0 = 0;
        int count1 = 0;
        String[] tmp = zeros.split(" ");
        for (int i = 0; i < tmp.length; i++) {
            if (Integer.parseInt(tmp[i]) == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        zeros = "";
        for (int i = 0; i < count0; i++) {
            zeros += "0 ";
        }
        for (int i = 0; i < count1; i++) {
            zeros += "1 ";
        }
        System.out.println("Theo cach 0 1: " + zeros);

        zeros = "";

        while (count1 > 0) {
            zeros += "1 ";
            count1--;
        }
        while (count0 > 0) {
            zeros += "0 ";
            count0--;
        }
        System.out.println("Theo cach 1 0: " + zeros);

    }
}