/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap4;

import java.util.Random;
import java.util.Scanner;


public class lecture5bai37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int points = 0;
        int incorrectCount = 0;
        while (incorrectCount < 3) {
            int numCount = random.nextInt(4) + 2 ;
            int[] numbers = new int[numCount];
            int correctAnswer = 0;
            StringBuilder proplem = new  StringBuilder();
            for (int i = 0; i < numCount; i++) {
            numbers[i] = random.nextInt(10) + 1;
            correctAnswer += numbers[i];
            proplem.append(numbers[i]);
            if (i < numCount - 1 ) {
             proplem.append(" + ");
             
            }
            }
            System.out.println(proplem.toString() + " = ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswer ){
                System.out.println(" Correct! ");
                points++ ;
            }
            else { 
                System.out.println("Wrong! The answer was" + correctAnswer);
                incorrectCount++;
            
            }
        }
        System.out.println("You earned " + points + " total points.");
        scanner.close();
    }
}
