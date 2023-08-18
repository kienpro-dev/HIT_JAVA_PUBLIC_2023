/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeMau;

import java.util.Scanner;

/**
 *
 * @author PC ACER
 */
//Viet 1 class HCN
//gom cac thuoc tinh chieuDai, chieuRong
//gom cac phuong thuc ChuVi, DienTich
//in ra chu vi va dien tich cua hcnChuVi, DienTich
//i
public class HCN {
    private int chieuDai;
    private int chieuRong;

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }



    public void chuVi(){
        int chuVi = (this.chieuDai + this.chieuRong) * 2;
        System.out.println("Chu vi cuả hcn là: " + chuVi);
    }

    public int dienTich(){
        int dienTich = this.chieuDai * this.chieuRong;
        return dienTich;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieuDai = sc.nextInt();
        int chieuRong = sc.nextInt();
        HCN hinhChuNhat = new HCN();
        hinhChuNhat.setChieuDai(chieuDai);
        hinhChuNhat.setChieuRong(chieuRong);
        hinhChuNhat.chuVi();
        System.out.println("Diện tích của hcn là: " + hinhChuNhat.dienTich());
    }
}
