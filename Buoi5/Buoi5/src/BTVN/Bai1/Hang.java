package BTVN.Bai1;

import java.util.Scanner;

/**
 *
 * @author TQDoanh
 */
public class Hang {
    private String maHang;
    private String tenHang;
    private NSX x;

    public Hang(){
        this.maHang = "";
        this.tenHang = "";
        x = new NSX();
    }

    public Hang(String maHang, String tenHang, NSX x) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.x = x;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NSX getX() {
        return x;
    }

    public void setX(NSX x) {
        this.x = x;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        this.maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        x.Nhap();
    }

    public void Xuat(){
        System.out.printf("%-20s%-25s",this.maHang, this.tenHang);
        x.Xuat();
    }

    public static void main(String[] args) {
        Hang hang = new Hang();
        hang.Nhap();

        System.out.printf("%-20s%-25s%-20s%-25s%-30s\n", "Ma hang", "Ten hang", "Ma NSX", "Ten NSX", "Dia chi NSX");

        hang.Xuat();
    }

}