/*
(Sorted array) Write a method that checks whether the array passed as input is sorted in
ascending order. The method should return true if the array is sorted; otherwise it should return
false. Call the method from main with different array sizes.
 */
package Lap10;

import java.util.Scanner;

public class Lap10_3 {

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = input.nextInt();

        int[] array = new int[size];

        System.out.print("Enter " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        if (isSorted(array)) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted");
        }

        input.close();
    }


    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; 
            }
        }
        return true; 
    }
}