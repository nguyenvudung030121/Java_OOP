package btcb;

import java.util.Scanner;

public class BTCB {

    public void Bai1(double S) {
        double V;
        V = ((4 * 3.14 * Math.pow(Math.sqrt(S / (4 * 3.14)), 3)) / 3);
        System.out.println("the tich la: " + V);
    }

    public void Bai2(double xA, double yA, double xB, double yB) {
        double kc;
        kc = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
        System.out.println("khoang cach AB la: " + kc);
    }

    public void Bai3(double xC, double yC, double R, double xM, double yM) {
        double d;
        d = R - Math.sqrt((xM - xC) * (xM - xC) + (yM - yC) * (yM - yC));
        if (d > 0) {
            System.out.println("M nam trong duong tron");
        } else if (d < 0) {
            System.out.println("M nam ngoai duong tron");
        } else {
            System.out.println("M thuoc duong tron");
        }
    }

    public void Bai4(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            int t = 0;
            if (a == b || b == c || c == a) {
                t += 1;
            }
            if (a == b && b == c && c == a) {
                t += 1;
            }
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                t += 3;
            }
            switch (t) {
                case 0:
                    System.out.println("Tam giac thuong");
                    break;
                case 1:
                    System.out.println("Tam giac can");
                    break;
                case 2:
                    System.out.println("Tam giac deu");
                    break;
                case 3:
                    System.out.println("Tam giac vuong");
                    break;
                case 4:
                    System.out.println("Tam giac vuong can");
            }
            double p = (a + b + c) / 2;
            System.out.println("      Dien tich tam giac: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));

        } else {
            System.out.println("Khong phai la tam giac !");
        }
    }

    public double DTich(double xA, double yA, double xB, double yB, double xC, double yC) {
        return 0.5 * Math.abs(xA * yB - xB * yA + xB * yC - xC * yB + xC * yA - xA * yC);
    }

    public void Bai5(double xA, double yA, double xB, double yB, double xC, double yC, double xM, double yM) {
        double d;
        d = DTich(xM, yM, xA, yA, xB, yB) + DTich(xM, yM, xA, yA, xC, yC) + DTich(xM, yM, xB, yB, xC, yC) - DTich(xA, yA, xB, yB, xC, yC);
        if (d > 0) {
            System.out.println("M nam ngoai tam giac ABC");
        } else if (DTich(xM, yM, xA, yA, xB, yB) == 0 || DTich(xM, yM, xA, yA, xC, yC) == 0 || DTich(xM, yM, xB, yB, xC, yC) == 0) {
            System.out.println("M nam tren canh tam giac ABC");
        } else {
            System.out.println("M nam trong tam giac ABC");
        }
    }

    public void Bai6(int a, int b, int c) {
        int t;
        if (a < b) {
            t = a;
            a = b;
            b = t;
        }
        if (a < c) {
            t = a;
            a = c;
            c = t;
        }
        if (b < c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println("Tang dan: " + c + b + a);
    }

    public void Bai7(float a, float b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh vo so nghiem");
            } else {
                System.out.println("phuong tirnh vo nghiem");
            }
        } else {
            double x;
            x = -b / a;
            System.out.println("Phuong trinh co 1 nghiem = " + x);
        }
    }

    public void Bai8(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vo nghiem.");
            } else {
                System.out.print("pt co 1 nghiem: " + -c / b);
            }
        } else {
            double dt, x1, x2;
            dt = b * b - 4 * a * c;
            if (dt < 0) {
                System.out.println("PT vo Nghiem");
            } else if (dt == 0) {
                x1 = -b / (2 * a);
                System.out.print("PT co nghiem Kep: " + x1);

            } else {
                x1 = (-b + Math.sqrt(dt)) / (2 * a);
                x2 = (-b - Math.sqrt(dt)) / (2 * a);
                System.out.println("PT co 2 nghiem: ");
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);
            }
        }
    }

    public void bai9(double x) {
        
        x /= 60;
        System.out.println("Thuoc goc phan tu  thu:" + (int) Math.ceil(x / 90) % 4);
        System.out.println("cos x = " + (double) Math.cos(x * 3.14 / 180));
    }

    public static void main(String[] args) {
        BTCB bt = new BTCB();

        //Bai 1
        System.out.print("Bai 1:");
        bt.Bai1(256.128);

        //Bai 2
        System.out.print("Bai 2:");
        bt.Bai2(3.2, -1.4, -5.7, 6.1);

        //Bai 3
        System.out.print("Bai 3:");
        bt.Bai3(0.5, 4.3, 7.4, 3.2, 6.5);

        //Bai 4
        System.out.print("bai 4:");
        bt.Bai4(3, 4, 5);

        //Bai 5
        System.out.print("Bai 5:");
        bt.Bai5(0, 5, 3, 0, 4, 7, 2, 6);

        //Bai 6
        System.out.print("Bai 6:");
        bt.Bai6(5, 3, 4);

        //Bai 7
        System.out.print("Bai 7: ");
        bt.Bai7(4, -3);

        //Bai 8
        System.out.print("Bai 8: ");
        bt.Bai8(2, 1, -4);

        //Bai 9
        System.out.print("Bai 9: ");
        bt.bai9(12345);
    }
}
