package com.company;

import java.util.Scanner;
//Tìm giá trị trong mảng
public class Main2 {
    public static void main(String[] args) {
        String[] students = {"Bin", "Jon", "Simp", "Beep"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student :");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí sinh viên trong danh sách : " + name + " là " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Không tìm thấy " + name + " trong danh sách");
        }
    }

}
