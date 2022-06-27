package Tuan29.src;

class bai4tuan28 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 3 va 7 là: ");

        for (int i = 0; i < 100; i++) {
            if (i % 3 != 0 || i % 7 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}