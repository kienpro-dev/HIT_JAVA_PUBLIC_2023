package CodeMau;
import java.util.Scanner;

import BaiTapTrenLop.Line;
import BaiTapTrenLop.Point;

class Student {
    public static Scanner scanner = new Scanner(System.in);
    
    private String name;
    
    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input() {
        System.out.print("Input name: ");
        this.setName(scanner.nextLine());
    }

    public void output() {
        System.out.println("Student name: " + this.getName());
    }
}

public class App {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 3);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(1,2,2,3);
        System.out.println(l1.getLength());
        System.out.println(l2.getLength());
    }
}

