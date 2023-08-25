package BTVN;

import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap msv: ");
        maSinhVien = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap diem toan: ");
        diemToan = sc.nextFloat();
        System.out.println("Nhap diem ly: ");
        diemLy = sc.nextFloat();
        System.out.println("Nhap diem hoa: ");
        diemHoa = sc.nextFloat();
        sc.nextLine();
    }

    public float diemTB() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    public void xuat() {
        System.out.printf("%-15s%-25s%-12.2f%-12.2f%-12.2f%-12.2f\n", maSinhVien, hoTen, diemToan, diemLy, diemHoa, diemTB());
    }

    public static void main(String[] args) {

        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        SinhVien sv3 = new SinhVien();
        SinhVien sv4 = new SinhVien();
        SinhVien sv5 = new SinhVien();

        sv1.nhap();
        sv2.nhap();
        sv3.nhap();
        sv4.nhap();
        sv5.nhap();

        System.out.printf("%-15s%-25s%-12s%-12s%-12s%-12s\n", "MSV", "Ho ten", "Diem Toan", "Diem Ly", "Diem Hoa", "TB");
        sv1.xuat();
        sv2.xuat();
        sv3.xuat();
        sv4.xuat();
        sv5.xuat();
    }
}
