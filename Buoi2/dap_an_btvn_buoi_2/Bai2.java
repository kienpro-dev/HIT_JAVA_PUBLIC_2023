package btvn_buoi_2;

import java.util.Scanner;

public class Bai2 {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        
        // 2.a
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0/i;
        }
        System.out.println("s = " + s);
        
        // 2.b
        double p = 0;
        for (int i = 1; i <= n; i++) {
            double fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            p += fact;
        }
        System.out.println("p = " + p);
    }
}
