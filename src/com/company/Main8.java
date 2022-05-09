package com.company;

import java.util.Scanner;

// Thêm phần tử vào mảng
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {7, 4, 2, 5, 1, 3, 0, 8, 9};
        System.out.println("Thêm 1 số bất kì");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí");
        int y = scanner.nextInt();
        array = addElement(array, y, x);
        for (int element : array) {
            System.out.print(element + "\t");
        }

    }

    static int[] addElement(int[] arr, int viTri, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < viTri; i++) {
            newArr[i] = arr[i];
        }
        newArr[viTri] = value;
        for (int i = viTri + 1; i < arr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}