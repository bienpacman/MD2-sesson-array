package com.company;

import java.util.Scanner;

// Tính tổng các số ở một cột xác định
public class Main13 {
    public static void main(String[] args) {
        while (1 > 0) {
            int[][] arr = {
                    {1, 2, 36, 7, 4},
                    {-9, -3, -1, 0, 5},
                    {9, 0},
                    {1, 3, 4, 7, 9, 0, 5}
            };
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập cột = ");
            byte col = scanner.nextByte();
            System.out.println("Total = " +totalCols(arr,col));
        }
    }
    static double totalCols(int[][] array, int x){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == x){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
