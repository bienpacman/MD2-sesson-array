package com.company;

public class Main6 {
    public static int maxValue(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args){
int []arr ={4,3,6,5,9,1,2};
int index = maxValue(arr);
        System.out.println("Phần tử lớn nhất : " + arr[index]);
    }
}
