package Tuan32;

//NgoQuangTruong-20198265

public class bai1 {
    public static String result(String name) {
        name = name.trim().toLowerCase();
        name = name.replaceAll("\\s+", " ");

        return name;
    }

    public static void main(String[] args) {
        String name = " Ngo   Quang    Truong";

        name = name.trim().toLowerCase();
        name = name.replaceAll("\\s+", " ");
        System.out.print(name);
    }
}