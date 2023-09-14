import java.util.Scanner;

public class Student extends Person {
    public static Scanner sc = new Scanner(System.in);

    private int id;
    private Address address;
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, int age, String gender, int id, Address address, double gpa) {
        super(name, age, gender);
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("ID: ");
        this.id = sc.nextInt();
        sc.nextLine();

        Address address = new Address();
        address.input();
        this.address = address;

        System.out.print("GPA: ");
        this.gpa = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void output() {
        super.output(); // output thuoc tinh person
        // output thuoc tinh Student
        System.out.printf("%-5d %-5.2f", id, gpa);
        // output thuoc tinh ket tap Address
        this.address.output();
        // xuong dong voi moi doi tuong
        System.out.println();
    }
}
