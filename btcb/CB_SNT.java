/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btcb;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CB_SNT {

    public static Scanner sc = new Scanner(System.in);

    public static boolean checkSNT(int number) {

        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.floor(Math.sqrt(number)); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String args[]) {
        int number = 100;
        System.out.print("Danh sach SNT <= " + number + " :");

        for (int i = 0; i <= number; i++) {
            if (checkSNT(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
