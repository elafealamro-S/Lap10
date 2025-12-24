/*
(Consecutive equal numbers) Write a method that tests whether the array passed as input has
four consecutive numbers with the same value. The method should return true if four consecutive
numbers with the same value are found in the array, else it should return false. Call the method
from main with different array sizes.
 */
package Lap10;

import java.util.Scanner;

public class Lap10_2 {

    public static boolean hasFourConsecutive(double[] array) {
        if (array.length < 4) {
            return false; // Less than 4 elements can't have 4 consecutive numbers
        }

        for (int i = 0; i <= array.length - 4; i++) {
            if (array[i] == array[i + 1] &&
                array[i] == array[i + 2] &&
                array[i] == array[i + 3]) {
                return true; // Found four consecutive numbers
            }
        }

        return false; // No four consecutive numbers found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        double[] array = new double[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }

        // Check for four consecutive equal numbers
        if (hasFourConsecutive(array)) {
            System.out.println("The array has four consecutive numbers with the same value");
        } else {
            System.out.println("The array does not have four consecutive numbers with the same value");
        }

        input.close();
    }
}