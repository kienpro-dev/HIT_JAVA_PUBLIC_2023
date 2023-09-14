package KiemTra.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    public static Scanner sc = new Scanner(System.in);

    private int classId;
    private int numberOfStudent;
    private ArrayList<Student> listStudents;

    public Classroom() {

    }

    public Classroom(int classId, int numberOfStudent, ArrayList<Student> listStudents) {
        this.classId = classId;
        this.numberOfStudent = numberOfStudent;
        this.listStudents = listStudents;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public void input() {
        System.out.print("Class ID: ");
        this.classId = sc.nextInt();
        System.out.print("Number of student: ");
        this.numberOfStudent = sc.nextInt();
        sc.nextLine();
        this.listStudents = new ArrayList<Student>();
        for(int i = 0; i < numberOfStudent; i++) {
            System.out.println("Input student " + (i + 1));
            Student s = new Student();
            s.input();
            this.listStudents.add(s);
//            this.listStudents.set(i, s);
        }
    }

    public void output() {
        System.out.println("Class ID: " + classId);
        System.out.println("Number of student: " + numberOfStudent);
        for(Student s : listStudents) {
            s.output();
        }
    }

    public ArrayList<Student> searchByName(String name) {
        ArrayList<Student> res = new ArrayList<Student>();
        for(Student s : listStudents) {
            if(s.getName().equals(name) == true) {
                res.add(s);
            }
        }
        return res;
    }
}
