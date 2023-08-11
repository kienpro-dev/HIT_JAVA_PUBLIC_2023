/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3;

import java.util.Scanner;

/**
 *
 * @author PC ACER
 */
public class Buoi3 {
    
    long giaiThua(int n){
        long gt = 1;
        for(int i = 1; i <= n; i++){
            gt *= i;
        }
        return gt;
    }
    
    static long giaiThua1(int n){
        long gt = 1;
        for(int i = 1; i <= n; i++){
            gt *= i;
        }
        return gt;
    }
    
    static final double PI = 3.14;
    
//    (public, private) + (static) <kieu tra ve> + <ten ham> (int a, int b) {
//         working
//        return ....
//    }
    
    int Sum(int a, int b){
        return a + b;
    }
    
    static int Sum1(int a, int b, int c){
        return a + b + c;
    }
    
    public static void main(String[] args) {
        //<kieu du lieu> + [] + <ten mang> = new + <kieu du lieu> [n]
//        int[] array = new int [5];
//        long[] arr = new long [10];
//        int [] a = {1,2,3,4,5}; 
//        
////        PI = 10.5;
//        
//        int sum1 = Buoi2.Sum1(a[0], a[1], a[2]);
//        System.out.println(sum1);
//        Buoi2 b2 = new Buoi2();
//        int sum = b2.Sum(a[0], a[1]);
//        System.out.println(sum);
//        int first = a[0];
//        int last = a[4]; 
//        System.out.println("Phan tu dau tien trong mang: " + first);
//        System.out.println("Phan tu cuoi cung trong mang:" + last);
//        
//        a[0] = 6;
//        System.out.println(a[0]);        
//        for(int i = 0; i < 5; i++){
//            System.out.print(a[i] + " ");
//        }
//        System.out.println("");    
//        for(int value : a){
//            System.out.print(value + " ");
//        }
        
//        long [] b = {1,2,3,4,5}; 
//        for(long value : b){
//            System.out.print(value + " ");
//        }
        
        //Hàm
        //Ham khong tra ve
        //    void
        //Ham co tra ve
        // int, long, float, boolean
        
        //Thư viện Math
//        double canBac2 = Math.sqrt(16);
//        System.out.println(canBac2);
//        
//        double x = Math.PI;
//        System.out.println(x);
//        
//        double logBase10 = Math.log10(10); 
//        System.out.println(logBase10);
//        
//        double ePowerX = Math.exp(1); 
//        System.out.println(ePowerX);
        
        //String
        
//        System.out.println(a.charAt(0));
//        System.out.println(a.length());
//        System.out.println(a.compareTo("Hgllo"));
//        if(a.compareTo("hello") != 0){
//            System.out.println("2 chuỗi khác nhau");
//        }
//        if(a.compareToIgnoreCase("heLlO") == 0){
//            System.out.println("2 chuỗi này giống nhau");
//        }
//        System.out.println(a.concat("World"));   
//        System.out.println(a.contains("eH"));
//        System.out.println(a.startsWith("e"));
//        System.out.println(a.endsWith("lo"));
//        System.out.println(a.equals("Hel"));
//        System.out.println(a.equalsIgnoreCase("hellO"));
//        System.out.println(a.isEmpty());
//           String x = "Dung";
//           String y = "";
//           if(y.isEmpty()){
//               System.out.println("Chuỗi y này rỗng");
//      
//        String a = "Xin Chao Moi Nguoi";     
//        int i = a.lastIndexOf(" ");
//        System.out.println(a.substring(i + 1));
//        System.out.println(a.substring(0, i));
            
//           System.out.println(a.replace("oi", "a"));
//            System.out.println(a.toLowerCase());
//            System.out.println(a.toUpperCase());
//            System.out.println(a.trim());
//            System.out.println(a.substring(3));
//            System.out.println(a.substring(3, 10));
//            System.out.println(a.lastIndexOf("X"));
            
//P = 1! + 2! + 3! + 4! + ... + n! với số n 
//nguyên dương được nhập từ bàn phím.
//Viết hàm có static và không có static
//
//Nhập vào họ tên, lấy ra tên và họ đệm
//Input:
//  Nguyen Hoang Dung  
//OutPut:
//Dung
//Nguyen Hoang
        
        //Bai1
//        Buoi2 buoi2 = new Buoi2();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        long sum = 0;
//        long sum1 = 0;
//        for(int i = 1; i <= n; i++){
//            sum += buoi2.giaiThua(i);
//            sum1 += Buoi2.giaiThua1(i);
//        }
//        System.out.println(sum);
//        System.out.println(sum1);
        
        
        //Bai2
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        hoTen = hoTen.trim();
        int index = hoTen.lastIndexOf(" ");
        String ten = hoTen.substring(index + 1);
        String hoDem = hoTen.substring(0, index);
        System.out.println(ten);
        System.out.println(hoDem);
        
    }
}
