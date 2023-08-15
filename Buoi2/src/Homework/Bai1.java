package Homework;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Số quả chanh Tèo có là :");
        int a= sc.nextInt();
        System.out.println("Số quả táo Tèo có là:");
        int b= sc.nextInt();
        System.out.println("Số quả lê Tèo có là:");
        int c=sc.nextInt();
        if (a==0 || b==0|| c==0){
            System.out.println("Không làm được siro");
        }
        else {
            int sum = 0;
            int chanh_sd = 0;
            int tao_sd = 0;
            int le_sd = 0;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    for (int k = 1; k <= c; k++) {
                        if ((j / i) == 2 && (k / j) == 2) {
                            sum = i + j + k;
                            chanh_sd = i;
                            tao_sd = j;
                            le_sd = k;
                            break;
                        }
                    }
                }
            }
            System.out.println("Tổng số quả cần sử dụng là:" + sum);
            System.out.println("(" + chanh_sd + " quả chanh, " + tao_sd + " quả táo," + le_sd + " quả lê)");
        }
    }
}
