package BTVN.Bai2;

import java.util.Scanner;

/**
 *
 * @author TQDoanh
 */
public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so sinh vien:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i=0; i<n; i++){
            students[i] = new Student();
            students[i].Input();
        }

        System.out.printf("%-20s%-10s%-10s%-20s%-15s%-20s%-15s\n", "Ten SV", "Lop", "Diem so", "Ten khoa", "Ngay vao", "Ten truong", "Ngay vao");

        for(int i=0; i<n; i++){
            students[i].Output();
        }
    }
}
