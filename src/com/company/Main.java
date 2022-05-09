package com.company;

import java.util.Scanner;
//Đảo ngược các phần tử của mảng
public class Main {

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size :");
            size = scanner.nextInt();
            if (size > 20) ;
            System.out.println("kích thước không được vượt quá 20!");
        }while (size > 20) ;
                arr = new int[size];
                int i = 0;
                while (i < arr.length) {
                    System.out.print("Nhập phần tử " + (i + 1) + ": ");
                    arr[i] = scanner.nextInt();
                    i++;
                }
                System.out.printf("%-20s%s", "Phần  tử trong mảng :", "");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + "\t");
                }
                for (int j = 0; j < arr.length / 2; j++) {
                    int temp = arr[j];
                    arr[j] = arr[size - 1 - j];
                    arr[size - 1 - j] = temp;
                }
                System.out.printf("\n%-20s%s", "Mảng đảo ngược: ", "");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + "\t");
                }
            }
        }
