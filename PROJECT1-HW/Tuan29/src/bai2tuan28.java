package Tuan29.src;


public class bai2tuan28 {
    
    public static void main(String[] args) {
        int count=0;
        for (int i = 2; i < 100; i++) {
            if (isPrimeNumber(i)) {
                count++;
                System.out.print(" " + i);
            }
            if(count==20){break;}
        }
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
