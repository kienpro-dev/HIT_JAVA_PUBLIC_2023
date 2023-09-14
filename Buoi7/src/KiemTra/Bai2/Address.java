package KiemTra.Bai2;

import java.util.Scanner;

public class Address {
    public static Scanner sc = new Scanner(System.in);

    private String city;
    private String district;

    public Address() {

    }

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void input() {
        System.out.print("City: ");
        this.city = sc.nextLine();
        System.out.print("District: ");
        this.district = sc.nextLine();
    }

    public void output() {
        System.out.printf("%-15s %-15s", city, district);
    }
}
