/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap4;

import java.util.Random;

public class Baitap4 {

    public static void main(String[] args) {
        Random random = new Random();
        int winningNumber = random.nextInt(100) + 1 ;
        System.out.println(" So trung thuong la : " + winningNumber
        );
      
    }
    
}
