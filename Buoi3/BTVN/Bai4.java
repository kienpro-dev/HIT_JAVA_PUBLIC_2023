package Buoi3.BTVN;

import java.util.Scanner;

public class Bai4 {
    public static boolean xuLy(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi la: ");
        String s = sc.nextLine();
        System.out.println(xuLy(s));
    }
}
