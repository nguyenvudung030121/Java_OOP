/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btcb;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CB_Fibonaci {

    public static Scanner sc = new Scanner(System.in);

    public static int fibonacci(int n) {
        int number_prev = 0;
        int number_middle = 1;
        int last_number = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                number_prev = number_middle;
                number_middle = last_number;
                last_number = number_middle + number_prev;
            }
            return last_number;
        }
    }
    
    public static int fibonacci_dequy(int n){
        if(n<0){
            return -1;
        }else if(n==0 || n==1 ){
            return n;
        }else{
           return fibonacci_dequy(n-1) + fibonacci_dequy(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhap vao gioi han day fibo = ");
        int n = sc.nextInt();

        System.out.print("Danh sach " + n + " so fibo: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        System.out.println();
        System.out.print("Danh sach " + n + " so fibo su dung dequy: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci_dequy(i) + " ");
        }

    }

}
