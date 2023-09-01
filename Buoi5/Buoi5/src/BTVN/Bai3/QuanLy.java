package BTVN.Bai3;

import java.util.Scanner;

/**
 *
 * @author TQDoanh
 */
public class QuanLy {
    private String maQL;
    private String hoTen;

    public QuanLy() {
    }

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma quan ly: ");
        this.maQL = sc.nextLine();
        System.out.print("Nhap ten quan ly: ");
        this.hoTen = sc.nextLine();
    }

    public void Xuat(){
        System.out.printf("Ma quan ly: %-15s Ten quan ly: %-25s\n", this.maQL, this.hoTen);
    }
}
