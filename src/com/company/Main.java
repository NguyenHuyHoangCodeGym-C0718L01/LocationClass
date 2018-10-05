package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input row: ");
        int row = scanner.nextInt();

        System.out.print("Input column: ");
        int column = scanner.nextInt();

        double[][] array = new double[row][column];
        array = inputArray(array);
        System.out.println("Max Value: "+Location.locateLargest(array).getMaxValue()+" at row: "+Location.locateLargest(array).getRow()+" and column: "+Location.locateLargest(array).getColumn());
    }

    public static double[][] inputArray(double[][] array){
        Scanner scanner = new Scanner(System.in);
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                System.out.print("Input your value at row: "+row+", column: "+column+" : ");
                array[row][column] = scanner.nextDouble();
            }
        }
        return array;
    }
}
