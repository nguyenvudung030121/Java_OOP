package btcb;

import java.util.Scanner;

public class Bai24 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int so, dau, cuoi, t, sod, d;
        System.out.print("Nhap vao so: ");
        so = sc.nextInt();
        t = 0;
        d = 0;
        sod = 0;
        dau=0;
        cuoi = so % 10;
        while (so != 0) {
            if (so / 10 == 0) {
                dau = so;
            }
            t += so % 10;
            sod = sod * 10 + so % 10;
            so = so / 10;
            d++;

        }
        System.out.println("Co " + d + " chu so");
        System.out.println("Chu so cuoi cung la: "+cuoi);
        System.out.println("Chu so dau tien la: "+dau);
        System.out.println("Tong cac chu so la: "+t);
        System.out.println("So dao la: "+sod);
    }
}
