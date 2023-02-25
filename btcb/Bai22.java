package btcb;

import java.util.Scanner;

public class Bai22 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int d, t, so;
        System.out.print("nhap vao so: ");
        so = sc.nextInt();
        System.out.print("Cac uoc so:");

        d = 0;
        t = 0;
        for (int i = 1; i <= so; i++) {
            if (so % i == 0) {
                d++;
                t+=i;
                System.out.print(" "+i);

            }
            
        }
        System.out.println("\nSo uoc: "+d);
        System.out.println("Tong cac uoc: "+t);
    }

}
