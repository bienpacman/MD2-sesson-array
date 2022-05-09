package com.company;

import java.util.Scanner;

//Tìm giá trị lớn nhất trong mảng
public class Main3 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size :");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích cơ không quá 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
            System.out.print("List :");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            int max = arr[0];
            int index = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j + 1;
                }
            }
            System.out.println("Gía trị lớn nhất trong danh sách là " + max + " tại vị trí " +
                    "" + index);
        }
    }
}
