package com.company;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size : ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Kích thước không được vượt quá 15");
        }while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm cho học sinh " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sách điểm :");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
            count ++;
        }
        System.out.print("\n Số học sinh thi đậu là " + count);
    }
}
