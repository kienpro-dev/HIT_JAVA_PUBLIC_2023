package btvn_buoi_2;

import java.util.Scanner;

public class Bai1 {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Nhập độ dài cạnh: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
