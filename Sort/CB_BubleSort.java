/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author ASUS
 */
public class CB_BubleSort {

    public static void bubleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swaper = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaper = true;
                }

            }
            if (!swaper) {
                break;
            }
        }
    }

    static void printArray(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 1, 4, 2, 8};

        System.out.print("mang dau: ");
        printArray(arr);

        bubleSort(arr);
        
        System.out.print("mang sạu: ");
        printArray(arr);

    }
}
