
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class lecture42 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" what percentage did you earn ? ");
        int percent = scanner.nextInt();
        if (percent >= 90 ) {
            System.out.println(" you got an a!");  
        }
        if (percent >= 80 )  {
            System.out.println("you got a b!");
        }
        if (percent >= 70 ) {
            System.out.println("you got a c!");
        }
        if (percent >= 60 ) {
            System.out.println("you got a d!"); 
        }
        if (percent <60 ) { 
            System.out.println("you got an f!");
        }
    }
}
