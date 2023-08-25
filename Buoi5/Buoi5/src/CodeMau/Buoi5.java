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
public class Buoi5 {
    public static int tinhTong(int a, int b){
        return a + b;
    }
    
    public static int tinhTong(int a, int b, int c){
        return a + b + c;
    }
    
    public static void main(String[] args) {
        int tong1 = tinhTong(2,5);
        double tong2 = tinhTong(2, 5, 8);
        System.out.println(tong1);
        System.out.println(tong2);
        
    }
    
    
    
    
    
    
}
