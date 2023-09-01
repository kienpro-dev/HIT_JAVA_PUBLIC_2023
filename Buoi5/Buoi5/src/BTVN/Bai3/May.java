package BTVN.Bai3;

import java.util.Scanner;

/**
 *
 * @author TQDoanh
 */
public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May() {
    }

    public May(String maMay, String tenMay, String tinhTrang) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma may: ");
        this.maMay = sc.nextLine();
        System.out.print("Nhap ten may: ");
        this.tenMay = sc.nextLine();
        System.out.print("Nhap tinh trang: ");
        this.tinhTrang = sc.nextLine();
    }

    public void Xuat(){
        System.out.printf("%-15s%-20s%-20s\n", this.maMay, this.tenMay, this.tinhTrang);
    }
}
