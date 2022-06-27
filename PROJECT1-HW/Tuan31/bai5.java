package Tuan31;

import java.util.ArrayList;
import java.util.Scanner;

public class bai5 {
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

		int countSNT = 0;
		int countHS = 0;
		for (int i = 0; i < num; i++) {
			if (check(arr[i])) {
				countSNT++;

			} else {
				if (arr[i] > 3) {
					countHS++;
				}
			}

		}
		listArr.add(countSNT);
		listArr.add(countHS);

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

			int countSNT = 0;
			int countHS = 0;
			for (i = 0; i < num; i++) {
				if (check(array[i])) {
					countSNT++;

				} else {
					if (array[i] > 3) {
						countHS++;
					}
				}

			}
			System.out.println("Co " + countSNT + " so nguyen to");
			System.out.println("Co " + countHS + " hop so");
		}

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