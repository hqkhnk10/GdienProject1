//NgoQuangTruong-20198265
package Tuan32;

public class bai6 {

    public static String result(String S) {
        char ch;
        String S1 = "";
        for (int i = 0; i < S.length(); i++) {
            ch = S.charAt(i);
            S1 = ch + S1;
        }

        return S;
    }

    public static void main(String[] args) {

        String S = "Cho truoc xau ky tu S", S1 = "";
        char ch;

        System.out.println("Xau ban dau: " + S);

        for (int i = 0; i < S.length(); i++) {
            ch = S.charAt(i);
            S1 = ch + S1;
        }
        System.out.println("Xau dao nguoc: " + S1);
    }
}
