/*
(Smallest Element) Write a method called minInArray() that finds and returns the smallest
element in an array of double values passed as an input parameter to the method. In the
main method, prompt the user to enter ten numbers and save them as an array. Pass this
array to the minInArray() method to obtain the smallest element in the array and then print
this number from the main method. */
package Lap10;

import java.util.Scanner;


public class Lap10_1 {

    public static double minInArray(double[] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        double smallest = minInArray(numbers);
        System.out.println("The smallest number entered is " + smallest);

        input.close();
    }
}