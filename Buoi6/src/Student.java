public class Student extends Person {
    private double gpa;

    public Student() {

    }

    // super:
    // - Tham chiếu trực tiếp đến constructor lớp cha
    // - trỏ đến các thành phần của lớp cha
    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    // annotation: đánh chú thích trong java
    @Override
    public void display() {
        super.display();
        System.out.println("GPA: " + gpa);
    }



}
