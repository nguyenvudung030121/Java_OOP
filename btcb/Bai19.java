package btcb;

import java.util.Scanner;

public class Bai19 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h, p, g, timeS;
        System.out.print("Nhap vao gio [1]: ");
        h = sc.nextInt();
        System.out.print("Nhap vao phut [1]: ");
        p = sc.nextInt();
        System.out.print("Nhap vao giay [1]: ");
        g = sc.nextInt();

        timeS = h * 3600 + p * 60 + g;

        System.out.print("Nhap vao gio [2]: ");
        h = sc.nextInt();
        System.out.print("Nhap vao phut [2]: ");
        p = sc.nextInt();
        System.out.print("Nhap vao giay [2]: ");
        g = sc.nextInt();

        timeS -= h * 3600 + p * 60 + g;
        if (timeS < 0) {
            timeS = -timeS;
        }
        
        System.out.println("Hieu thoi gian: ");
        System.out.println("Gio: "+timeS/3600);
        System.out.println("Phut: "+(timeS%3600)/60);
        System.out.println("Giay: "+(timeS%3600)%60);
        
    }

}
