package btvn_buoi_2;

import java.util.Scanner;

public class Bai4 {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Nhập a: "); 
        double a = scanner.nextDouble();
        System.out.print("Nhập b: "); 
        double b = scanner.nextDouble();
        System.out.print("Nhập c: "); 
        double c = scanner.nextDouble();
        
        double p = c/a;
        double s = -b/a;
        double delta = b*b - 4*a*c;
        
        if (p > 0 && s < 0 || delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        }
        else if (p == 0 && s <= 0) {
            System.out.println("Phương trình có nghiệm duy nhất");
            System.out.println("x1 =  " + 0);
        }
        else if (p < 0) {
            double t = (-b + Math.sqrt(delta))/2/a;
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("x1 =  " + Math.sqrt(t));
            System.out.println("x2 = -" + Math.sqrt(t));
        }
        else if (p > 0 && delta == 0) {
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("x1 =  " + Math.sqrt(s/2));
            System.out.println("x2 = -" + Math.sqrt(s/2));
        }
        else if (p == 0 && s > 0) {
            System.out.println("Phương trình có 3 nghiệm là: ");
            System.out.println("x1 =  " + 0);
            System.out.println("x2 =  " + Math.sqrt(s));
            System.out.println("x3 = -" + Math.sqrt(s));
        }
        else {
            double t1 = (-b + Math.sqrt(delta))/2/a;
            double t2 = (-b - Math.sqrt(delta))/2/a;
            System.out.println("Phương trình có 4 nghiệm là: ");
            System.out.println("x1 =  " + Math.sqrt(t1));
            System.out.println("x2 = -" + Math.sqrt(t1));
            System.out.println("x3 =  " + Math.sqrt(t2));
            System.out.println("x4 = -" + Math.sqrt(t2));
        }
    }
}
