package BTVN;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXuatBan;
    private int namXuatban;

    public Sach() {

    }

    public Sach(String maSach, String tenSach, String tenTacGia, String nhaXuatBan, int namXuatban) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatban = namXuatban;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatban() {
        return namXuatban;
    }

    public void setNamXuatban(int namXuatban) {
        this.namXuatban = namXuatban;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        tenTacGia = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatban = sc.nextInt();
        sc.nextLine();
    }

    public void output() {
        System.out.printf("%-25s%-25s%-25s%-25s%-10d\n", maSach, tenSach, tenTacGia, nhaXuatBan, namXuatban);
    }


    public static void main(String[] args) {
        Sach sach1 = new Sach();
        Sach sach2 = new Sach();
        Sach sach3 = new Sach();
        Sach sach4 = new Sach();
        Sach sach5 = new Sach();

        sach1.input();
        sach2.input();
        sach3.input();
        sach4.input();
        sach5.input();


        System.out.printf("%-25s%-25s%-25s%-25s%-10s\n", "Ma sach", "Ten sach", "Tac gia", "Nha xuat ban", "Nam xuat ban");
        sach1.output();
        sach2.output();
        sach3.output();
        sach4.output();
        sach5.output();
    }

}
