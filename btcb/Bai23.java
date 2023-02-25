package btcb;

import java.util.Scanner;

public class Bai23 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean ktSHH(int n) {
        int s = 0;
        boolean kt = true;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }

        if (s == n) {
            kt = true;
        } else {
            kt = false;
        }
        return kt;
    }

    public static void main(String[] args) {
        int so;
        System.out.print("Nhap vao n = ");
        so = sc.nextInt();
        int i = 0;
        System.out.println("so hoan hao nho hon  " + so+ ":");
        while (i < so) {
            i++;
            if (ktSHH(i) == true) {
                System.out.print(i + " ");
            }

        }
    }
}
