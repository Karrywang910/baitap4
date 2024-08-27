/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap4;

import java.util.Scanner;


public class lecture41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data:");
        boolean check = scanner.hasNextInt();// kiemtra xem data tu ban phim co phai la so nguye hay khong 
        System.out.println("co phai la so nguyen khong? " + check
        );
    }
}
