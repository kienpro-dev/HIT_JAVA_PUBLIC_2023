/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeMau;

/**
 *
 * @author PC ACER
 */
public class Person {
    private int id;
    private String name ;
    private int age;
    private String address;

    public Person(String ten, int tuoi, String diaChi){
        name = ten;
        age = tuoi;
        address = diaChi;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age, String address) {
        this.age = age;
        this.address = address;
    }

    public Person(){

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id){
        if(id > 100) return;
        else{
            this.id = id;
        }
    }

    public void coTheDi(){
        System.out.println("Person có thể đi");
    }

    public double coTheTinhCanBacHai(int n){
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Nguyen Van A", 20, "Ha Noi");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAddress());

        Person person2 = new Person();
        person2.setId(101);
        String name = "Nguyen Thi B";
        person2.setName(name);
        System.out.println(person2.name);
    }
}

//Viet 1 class HCN
//gom cac thuoc tinh chieuDai, chieuRong
//gom cac phuong thuc ChuVi, DienTich
//in ra chu vi va dien tich cua hcn

