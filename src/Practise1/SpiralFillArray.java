package Practise1;

import java.util.Scanner;

/*
Write a method that creates an array of given length N and fills it in a spiral from 1 to N*N
 */

public class SpiralFillArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        scanner.close();
        int[][] arr = new int[arraySize][arraySize];
        //int[][] arr2 = new int[(int) Math.ceil(Math.sqrt(arraySize))][(int) Math.ceil(Math.sqrt(arraySize))];

        int counter = 1;
        int beginIndex = 0;
        int endIndex = arraySize - 1;

        while (counter < arraySize*arraySize) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[beginIndex][j] == 0) {
                    arr[beginIndex][j] = counter;
                    counter++;
                }
            }

            for (int i = beginIndex; i < arr.length; i++) {
                if (arr[i][endIndex] == 0) {
                    arr[i][endIndex] = counter;
                    counter++;
                }
            }

            for (int j = endIndex; j >= 0; j--) {
                if (arr[endIndex][j] == 0) {
                    arr[endIndex][j] = counter;
                    counter++;
                }
            }

            for (int i = endIndex; i >= 0; i--) {
                if (arr[i][beginIndex] == 0) {
                    arr[i][beginIndex] = counter;
                    counter++;
                }
            }

            beginIndex++;
            endIndex--;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0){
                    arr[i][j] = arraySize*arraySize;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
