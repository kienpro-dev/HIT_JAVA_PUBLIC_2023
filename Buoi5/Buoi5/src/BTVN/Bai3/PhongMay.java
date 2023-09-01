package BTVN.Bai3;

import java.util.Scanner;

/**
 *
 * @author TQDoanh
 */
public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {
        x= new QuanLy();
    }

    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phong: ");
        this.maPhong = sc.nextLine();
        System.out.print("Nhap ten phong: ");
        this.tenPhong = sc.nextLine();
        System.out.print("Nhap dien tich: ");
        this.dienTich = sc.nextDouble();
        System.out.print("Nhap so may:");
        this.n = sc.nextInt();
        y = new May[n];
        x.Nhap();
        for(int i=0; i<n; i++){
            y[i] = new May();
            y[i].Nhap();
        }
    }

    public void Xuat(){
        System.out.printf("Ma phong: %-15s Ten phong: %-20s\n", this.maPhong, this.tenPhong);
        System.out.println("Dien tich: " + this.dienTich);
        x.Xuat();

        System.out.printf("%-15s%-20s%-20s\n", "Ma may", "Ten may", "Tinh trang");

        for(int i=0; i<n; i++){
            y[i].Xuat();
        }
    }

    public static void main(String[] args) {
        PhongMay phongMay = new PhongMay();
        phongMay.Nhap();
        phongMay.Xuat();
    }

}
