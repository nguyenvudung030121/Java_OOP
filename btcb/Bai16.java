package btcb;

import java.util.Scanner;

public class Bai16 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int d, m, y, dow, top, m1, y1;
        System.out.println("Nhap vao nam: ");
        y = sc.nextInt();
        m = 1;
        y1 = y - (14 - m) / 12;
        m1 = m + 12 * ((14 - m) / 12) - 2;
        dow = (1 + y1 + y1 / 4 - y1 / 100 + y1 / 400 + (31 * m1) / 12) % 7;
        for (m = 1; m <= 12; ++m) {
            System.out.println("\nthang: " + m);
            switch (m) {
                case 4: {
                    top = 30;
                    break;
                }
                case 6: {
                    top = 30;
                    break;
                }
                case 9: {
                    top = 30;
                    break;
                }
                case 11: {
                    top = 30;
                    break;
                }
                case 2: {
                    if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                        top = 29;
                        break;
                    } else {
                        top = 28;
                        break;
                    }

                }
                default: {
                    top = 31;
                }
            }
            System.out.println("  S  M  T  W  T  F  S\n");
            for (d = 0; d < dow; ++d) {
                System.out.print("   ");
            }
            for (d = 1; d <= top; ++d) {
                System.out.print("  " + d);
                if ((dow + d) % 7 == 0) {
                    System.out.print("\n");
                }
                dow = (dow + top) % 7;
                if (dow == 6) {
                  //  System.out.print("\n");
                }

            }
        }

    }
}
