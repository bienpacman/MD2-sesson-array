package com.company;
// Tìm phần tử lớn nhất trong mảng hai chiều
public class Main10 {
    public static void main(String[] args) {
        int[][] array = {{34,1,6,55},{76,4,86,23},{999,67,43,12}};
        System.out.println("MAX === " + timMax(array));
    }
    static int timMax(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
