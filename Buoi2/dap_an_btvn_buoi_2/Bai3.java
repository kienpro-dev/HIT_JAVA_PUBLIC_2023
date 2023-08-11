package btvn_buoi_2;

import java.util.Scanner;

public class Bai3 {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println(n + " không phải là số nguyên tố.");
            return;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(n + " không phải là số nguyên tố.");
                return;
            }
        }
        
        System.out.println(n + " là số nguyên tố.");
    }
}
