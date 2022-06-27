//NgoQuangTruong-20198265
package Tuan32;

public class bai9 {
    public static String result(String[] name) {
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            name[i] = name[i].trim();
            name[i] = name[i].replaceAll("\\s+", " ");
            System.out.println(name[i]);
            String[] tmp = name[i].split("\\s+");
            if (tmp[tmp.length - 1].startsWith("H")) {
                count++;
            }
        }

        return String.valueOf(count);
    }

    public static void main(String[] args) {
        String[] name = { " Ngo   Thi    Huong", "Hhi Huang Han", "Nguyen Van Thi", "An Hi Truong" };
        System.out.println("Danh sach hoc sinh:");
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            name[i] = name[i].trim();
            name[i] = name[i].replaceAll("\\s+", " ");
            System.out.println(name[i]);
            String[] tmp = name[i].split("\\s+");
            if (tmp[tmp.length - 1].startsWith("H")) {
                count++;
            }
        }
        System.out.print("Co " + count + " bat dau ten bang chu \"H\" ");
    }
}