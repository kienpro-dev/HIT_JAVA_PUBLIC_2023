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
public class SinhVien {
    private static int cnt = 1;
    
    private int id;
    private String name;
    private String age;
    private Phone phone;

    public SinhVien(String name, String age, Phone phone) {
        this.id = cnt;
        cnt++;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public SinhVien() {
    }


    public void in(){
        System.out.println("Id sinh vien:" + id);
        System.out.println("Ten sinh vien: " + name);
        System.out.println("Tuoi sinh vien:" + age);
        System.out.println("Info phone: \n");
        phone.in();
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien[] sinhViens = new SinhVien[2];
        Phone phone = new Phone(1, "SamSung Galaxy Note 7", "yellow", "SamSung");    
        for(int i = 0; i < 2; i++){
            String name = sc.nextLine();
            String age = sc.nextLine();
            SinhVien sinhVien = new SinhVien(name, age, phone);
            sinhViens[i] = sinhVien;
        }
        for(int i = 0; i < 2; i++){
            sinhViens[i].in();
        }
    }
    
}
