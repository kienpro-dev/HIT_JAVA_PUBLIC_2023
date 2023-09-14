package KiemTra.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Classroom clr = new Classroom();
        clr.input();
        clr.output();

        System.out.println("------------------------------------------");
        System.out.print("Find name: ");
        String name = sc.nextLine();
        ArrayList<Student> res = clr.searchByName(name);
        for(Student s : res) {
            s.output();
        }
    }
}
