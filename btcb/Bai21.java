package btcb;

import java.util.Scanner;

public class Bai21 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float dc, d1, d2, d3, sum;
        char kv, dt;
        System.out.print("Nhap diem chuan: ");
        dc = sc.nextFloat();
        System.out.print("Nhap diem 3 mon thi: ");
        d1 = sc.nextFloat();
        d2 = sc.nextFloat();
        d3 = sc.nextFloat();
        if (d1 * d2 * d3 != 0) {
            System.out.print("Nhap vao khu vuc (A,B,C,X): ");
            kv = sc.next().charAt(0);
            System.out.print("Nhap vao doi tuong(1,2,3,0): ");
            dt = sc.next().charAt(0);
            sum = d1 + d2 + d3;
            switch (kv) {
                case 'A': {
                    sum += 2;
                    break;
                }
                case 'B': {
                    sum += 1;
                    break;
                }
                case 'C': {
                    sum += 0.5;
                    break;
                }
                default: {
                    break;
                }
            }

            switch (dt) {
                case '1': {
                    sum += 2.5;
                    break;
                }
                case '2': {
                    sum += 1.5;
                    break;
                }
                case '3': {
                    sum += 1;
                    break;
                }
                default: {
                    break;
                }
            }
            if (sum >= dc){
                System.out.println("Dau - "+sum);
            }else{
                System.out.println("Rot - "+sum);
            }
        }else{
            System.out.println("Rot - "+(d1+d2+d3));
        }

    }
}
