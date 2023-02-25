package btcb;

import java.util.Scanner;

public class Bai20 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int kw, money;
        System.out.print("Nhap so kw: ");
        kw = sc.nextInt();
        if (kw < 100) {
            money = kw * 500;
        } else if (kw <= 250) {
            money = 100 * 500 + 800 * (kw - 100);
        } else if (kw <= 350) {
            money = 100 * 500 + 800 * 150 + 1000 * (kw - 250);
        }else
            money = 100 * 500 + 800 * 150 + 1000 * 100 + 1500* ( kw -350);
        System.out.println("Tong tien la: "+money);
    }
}
