//NgoQuangTruong-20198265
package Tuan32;

public class bai7 {
    public static String result(String[] name) {
        int count = 0, index = 0;
        for (int i = 0; i < name.length; i++) {
            name[i] = name[i].trim();
            name[i] = name[i].replaceAll("\\s+", " ");
            System.out.println(name[i]);
            String[] tmp = name[i].split("\\s+");
            while ((index = tmp[tmp.length - 1].indexOf("An", index)) != -1) {
                count++;
                index++;
            }
        }

        return String.valueOf(count);
    }

    public static void main(String[] args) {
        String[] name = { " Ngo   Quang    Truong", "Ngo Quang An", "Nguyen Van An", "An An Truong" };
        System.out.println("Danh sach hoc sinh:");
        int count = 0, index = 0;
        for (int i = 0; i < name.length; i++) {
            name[i] = name[i].trim();
            name[i] = name[i].replaceAll("\\s+", " ");
            System.out.println(name[i]);
            String[] tmp = name[i].split("\\s+");
            while ((index = tmp[tmp.length - 1].indexOf("An", index)) != -1) {
                count++;
                index++;
            }
        }
        System.out.print("Co " + count + " ban ten An");
    }
}
