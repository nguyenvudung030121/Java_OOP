/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btcb;

import java.util.Scanner;

public class Bai10 {

    public static Scanner sc = new Scanner(System.in);

    public static int Demcs(long x) {
        int d = 0;
        while (x != 0) {
            x = x / 10;
            d++;
        }
        return d;
    }

    public static void main(String[] args) {
        long sin;
        while (true) {
            System.out.println("Nhap 0 de dung !");
            System.out.print("Nhap vao so SIN(9 chu so): ");
            sin = sc.nextLong();
            if (sin == 0) {
                break;
            }
            if (Demcs(sin) != 9 || sin < 0) {
                System.out.println("So Sin khong hop le !. Nhap lai.");
            } else {
                int Sum = (int) (sin % 10);
                sin = sin / 10;
                int t;
                for (int i = 1; i <=8; sin = sin / 10, i++) {
                    t = (int) (sin % 10);
                    if (i % 2 == 0) {
                        Sum = Sum + t;
                        System.out.println(Sum);
                    } else {
                        Sum = Sum + (t * 2) / 10 + (t * 2) % 10;
                    }
                }
                
                if (Sum % 10 == 0) {
                    System.out.println("SIN hop le!");
                } else {
                    System.out.println("SIN ko hop le!");
                }
            }
        }
    }
}
