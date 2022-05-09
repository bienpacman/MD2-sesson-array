package com.company;
// Gộp mảng
public class Main9 {
    public static void main(String[] args) {
        int[] array1 = {4,6,74,3,2,9};
        int[] array2 = {5,86,2,1,8,43,21,25,79};
        array1 = plusArray(array1,array2);
        System.out.println("Mảng được gộp");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
    static int[] plusArray(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[arr1.length + i] = arr2[i];
        }
        return newArray;
    }

}
