package Tuan29.src;

public class bai7tuan28 {
    public static void main(String[] args) {
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0;
        for (int i = 0; i <= 100; i++)
            switch (i % 7) {
                case 0:
                    d1++;
                    break;
                case 1:
                    d2++;
                    break;
                case 2:
                    d3++;
                    break;
                case 3:
                    d4++;
                    break;
            }
        System.out.println("Co tat ca " + d1 + " so chia het cho 7");
        System.out.println("Co tat ca " + d2 + " so chia 7 du 1");
        System.out.println("Co tat ca " + d3 + " so chia 7 du 2");
        System.out.println("Co tat ca " + d4 + " so chia 7 du 3");
    }
}
