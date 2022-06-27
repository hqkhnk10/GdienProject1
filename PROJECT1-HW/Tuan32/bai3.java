package Tuan32;

//NgoQuangTruong-20198265
public class bai3 {
    public static String result(String name) {
        name = name.trim();
        String[] tmp = name.split("\\s+");

        return tmp[tmp.length - 1];
    }

    public static void main(String[] args) {
        String name = " Ngo   Quang    Truong";
        name = name.trim();
        String[] tmp = name.split("\\s+");
        System.out.println("Ten: " + tmp[tmp.length - 1].toUpperCase());
    }
}