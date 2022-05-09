package com.company;

import java.util.Scanner;

//Tìm giá trị nhỏ nhất trong mảng
public class Main11 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size :");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích cỡ không quá 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập phần tử " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
            System.out.print("Array : ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            int min = arr[0];
            int index = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j + 1;
                }
            }
            System.out.println("Giá trị nhỏ nhất trong danh sánh " + min + " tại vị trí " + "" + index);
        }
    }
}

