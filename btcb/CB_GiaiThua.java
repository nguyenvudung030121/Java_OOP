/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btcb;

/**
 *
 * @author ASUS
 */
public class CB_GiaiThua {

    public static int cal_GT(int number) {

        int gt = 1;

        if (number == 0 || number == 1) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            for (int i = 2; i <= number; i++) {
                gt *= i;
            }
        }
        return gt;
    }

    public static int dq_GT(int number) {

        if (number == 0 || number == 1) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return number * dq_GT(number - 1);
        }
    }

    public static void main(String args[]) {
        int number = 5;
        System.out.print("Giai thua cua " + number + " la : ");

        System.out.print(dq_GT(number) + " ");
    }
}
