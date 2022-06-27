package Tuan32;

//NgoQuangTruong-20198265

public class bai2 {
    public static String result(String name) {
        String mySubstring = "abc";
        int count = 0, index = 0;
        while ((index = name.indexOf(mySubstring, index)) != -1) {
            count++;
            index++;
        }

        return String.valueOf(count);
    }

    public static void main(String[] args) {
        String myString = "sdklfjkabc sdfabcasd";
        String mySubstring = "abc";
        int count = 0, index = 0;
        while ((index = myString.indexOf(mySubstring, index)) != -1) {
            count++;
            index++;
        }
        System.out.print("So lan xuat hien xau con \"abc\" trong xau " + myString + "la: " + count + " lan");
    }
}