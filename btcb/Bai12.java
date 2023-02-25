package btcb;

import java.util.Scanner;

public class Bai12 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a1, b1, c1, a2, b2, c2;
        float d, dx, dy, x, y;
        System.out.print("Nhap a1 = ");
        a1 = sc.nextInt();
        System.out.print("Nhap b1 = ");
        b1 = sc.nextInt();
        System.out.print("Nhap c1 = ");
        c1 = sc.nextInt();
        System.out.print("Nhap a2 = ");
        a2 = sc.nextInt();
        System.out.print("Nhap b2 = ");
        b2 = sc.nextInt();
        System.out.print("Nhap c2 = ");
        c2 = sc.nextInt();
        d = a1 * b2 - a2 * b1;
        dx = c1 * b2 - c2 * b1;
        dy = a1 * c2 - a2 * c1;
        if (d == 0) {
            if (dx + dy == 0) {
                System.out.println("He phuong trinh co vo so nghiem");
            } else {
                System.out.println("He phuong trinh vo nghiem");
            }
        } else {
            x = dx / d;
            y = dy / d;
            System.out.println("x= "+x+"\ny= "+y);
        }
    }
}
