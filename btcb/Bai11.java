package btcb;

import java.util.Scanner;
import java.util.Random;

public class Bai11 {

    public static Scanner sc = new Scanner(System.in);
    public static Random rd = new Random();

    public static void main(String[] args) {
        char Human, ComChoose;
        int h = 0, c = 0;
        while (true) {
            System.out.print("Chon b-d-k,ky tu khac de thoat: ");
            Human = sc.next().charAt(0);
            if (Human != 'b' && Human != 'd' && Human != 'k') {
                    break;
            }
            int Com = rd.nextInt(3) + 1;
            if (Com == 1) {
                System.out.println("Computer: b");
            } else if (Com == 2) {
                System.out.println("Computer: d");
            } else {
                System.out.println("Computer: k");
            }
            switch (Human) {
                case 'b': {
                    if (Com == 1) {
                        System.out.println("Ty so human - computer: " + h + " - " + c);
                    } else if (Com == 2) {
                        h++;
                        System.out.println("Ty so human - computer: " + h + " - " + c);
                    } else {
                        c++;
                        System.out.println("Ty so human - computer: " + h + " - " + c);
                    }
                    break;
                }
                case 'd': {
                    if (Com == 2) {
                        System.out.println("Ty so human - computer: " + h + " - " + c);
                    } else if (Com == 3) {
                        h++;
                        System.out.println("Ty so human - computer: " + h + " - " + c);
                    } else {
                        c++;
                        System.out.println("Ty so human - computer: " + h + " - " + c);
                    }
                    break;
                }
                case 'k': {
                    if (Com == 3) {
                        System.out.println("Ty so human - computer: " + h + " - " + c);
                    } else if (Com == 1) {
                        h++;
                        System.out.println("Ty so human - computer: " + h + " - " + c);
                    } else {
                        c++;
                        System.out.println("Ty so human - computer: " + h + " - " + c);
                    }
                    break;
                }
            }
        }
    }
}
