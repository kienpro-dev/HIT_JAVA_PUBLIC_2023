package btvn_buoi_2;

import java.util.Scanner;

public class Bai5 {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Chanh: "); 
        int chanh = scanner.nextInt();
        System.out.print("Táo: "); 
        int tao = scanner.nextInt();
        System.out.print("Lê: "); 
        int le = scanner.nextInt();
        
        int ans = Math.min(chanh, Math.min(tao/2, le/4));
        System.out.println("=> Tổng số quả tối đa: " + ans*7 + " (Chanh: " + ans + ", Táo: " + ans*2 + ", Lê: " + ans*4 + ")");
    }
}
