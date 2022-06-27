package Tuan32;

//NgoQuangTruong-20198265
public class bai4 {
    public static String result(String name) {
        name = name.trim();
        String[] tmp = name.split("\\s+");

        return tmp[0];
    }

    public static void main(String[] args) {
        String name = " Ngo   Quang    Truong";
        name = name.trim();
        String[] tmp = name.split("\\s+");
        System.out.println("Ho: " + tmp[0].toUpperCase());
    }
}
