package com.company;

import java.util.Scanner;

//Đếm số lần xuất hiện của ký tự trong chuỗi
public class Main15 {
    public static void main(String[] args) {
        while (1 > 0) {
            String str = "bin supper dep zai khong co nguoi iu";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập kí tự đi fen!");
            char s = scanner.next().charAt(0);
            System.out.println("số kí tự = " +checkString(str,s));
        }
    }
    static int checkString(String str, char x){
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == x){
                count++;
            }
        }
        return count;
    }
}
