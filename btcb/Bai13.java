package btcb;

import java.util.Scanner;

public class Bai13 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int d, m, y, top, dayofweek;
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
            System.out.println("Hop le.");
            y -= (14 - m) / 12;
            m += 12 * ((14 - m) / 12) - 2;
            dayofweek = (d + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
            if (dayofweek==0)
            {
                System.out.println("Chu nhat");
                break;
            }
            else{
                dayofweek++;
                System.out.println("Thu "+dayofweek);
                break;
            }
        }

    }

}
