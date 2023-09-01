package BTVN.Bai2;

import java.util.Scanner;

/**
 *
 * @author TQDoanh
 */
public class Faculty {
    private String name;
    private String date;
    private School x;

    public Faculty() {
        this.x = new School();
    }

    public Faculty(String name, String date, School x) {
        this.name = name;
        this.date = date;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }



    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten khoa: ");
        this.name = sc.nextLine();
        System.out.print("Nhap ngay vao khoa: ");
        this.date = sc.nextLine();
        System.out.print("Nhap ten truong: ");
        this.x.setName(sc.nextLine());
        System.out.print("Nhap ngay vao truong: ");
        this.x.setDate(sc.nextLine());
    }

    public void Output(){
        System.out.printf("%-20s%-15s%-20s%-15s\n", this.name, this.date, this.x.getName(), this.x.getDate());
    }


}
