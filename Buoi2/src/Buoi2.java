import java.util.Scanner;

public class Buoi2 {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("Hello " + "World!");
//        System.out.println("Hello " + 18);
//        System.out.println(1 + 1);
//
//        System.out.print("Hello ");
//        System.out.print("World!");
//
//        System.out.printf("Hello %d %s", 18, "World!");
//
//        int a = 10;
//        double b = 9.5;
//        char c = 'x';
//        boolean d = false;
//        String s = "Hello world!";
//
//        int e = (int) 10.2;
//        float f = (float) 10;
//        int c_ascii = (int) c;

//        Sử dụng Scanner: import java.util.Scanner;
        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        double b = s.nextDouble();
//        String s1 = s.next();
//        String s2 = s.nextLine();

        int a = s.nextInt();
        int b = s.nextInt();
        if (a > b) {
            System.out.println("a lớn hơn b");
        } else if (a < b) {
            System.out.println("a nhỏ hơn b");
        } else {
            System.out.println("a bằng b");
        }

//        System.out.println(a > b ? "a lớn hơn b" : a < b ? "a nhỏ hơn b" : "a bằng b");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        do {
            System.out.println(j);
            j--;
        } while (j > 0);
    }
}
