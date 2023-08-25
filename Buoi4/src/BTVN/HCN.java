package BTVN;

import java.util.Scanner;

public class HCN {
    private float D;
    private float R;

    public HCN() {
    }

    public HCN(float d, float r) {
        D = d;
        R = r;
    }

    public float getD() {
        return D;
    }

    public void setD(float d) {
        D = d;
    }

    public float getR() {
        return R;
    }

    public void setR(float r) {
        R = r;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        D = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        R = sc.nextFloat();
    }

    public float dienTich() {
        return D * R;
    }

    public float chuVi() {
        return (D + R) * 2;
    }

    public void veHCN() {
        if (Math.round(D) == D && Math.round(R) == R) {
            for (int i = 1; i <= R; i++) {
                for (int j = 1; j <= D; j++)
                    System.out.print("*");
                System.out.println();
            }
        } else {
            System.out.println("Khum ve duoc dau :v");
        }
    }

    public void xuat() {
        System.out.println("Chieu dai: " + D);
        System.out.println("Chieu rong: " + R);
        System.out.println("Chu vi: " + chuVi());
        System.out.println("Dien tich: " + dienTich());
    }

    public static void main(String[] args) {
        HCN hcn = new HCN();
        hcn.nhap();
        hcn.xuat();
        hcn.veHCN();
    }
}