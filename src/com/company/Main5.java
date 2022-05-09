package com.company;
//Tìm giá trị nhỏ nhất trong mảng sử dụng phương thức
public class Main5 {
    public static int minValue(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
int []arr = {4,12,-7,8,2,6,-2};
int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất tong mảng là: " + arr[index]);
    }
}
