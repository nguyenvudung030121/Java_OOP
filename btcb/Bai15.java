package btcb;

import java.util.Scanner;

public class Bai15 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int d, m, y, s, i;
        System.out.print("Nhap vao ngay = ");
        d = sc.nextInt();
        System.out.print("Nhap vao thang = ");
        m = sc.nextInt();
        System.out.print("Nhap vao nam = ");
        y = sc.nextInt();
        while (true) {
            if (d < 1 || d > 31) {
                System.out.println("Ngay ko hop le");
                break;
            }
            if (m < 1 || m > 12) {
                System.out.println("Thang ko hop le");
                break;
            }
            if (y < 1582) {
                System.out.println("Nam ko hop le");
                break;
            }
            s = d;
            for (i = 1; i < m; ++i) {
                switch (i) {
                    case 4: {
                       s+= 30;
                        break;
                    }
                    case 6: {
                       s+= 30;
                        break;
                    }
                    case 9: {
                       s+= 30;
                        break;
                    }
                    case 11: {
                       s+= 30;
                        break;
                    }
                    case 2: {
                        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                           s+= 29;
                            break;
                        } else {
                           s+= 28;
                            break;
                        }

                    }
                    default: {
                       s+= 31;
                    }
                }
            }
            System.out.println("La ngay thu: "+s);
            break;
        }
    }
}