package Tuan29.src;

class bai5tuan28 {
    public static void main(String[] args) {

        for (int i = 1000; i < 2000; i++) {
            if (i % 3 != 0 || i % 5 != 0 || i % 7 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}