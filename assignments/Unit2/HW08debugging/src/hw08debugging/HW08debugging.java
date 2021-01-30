/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08debugging;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW08debugging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int factorial=1;
        int num =15 ;
        
        
        do {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);

        factorial = 1;
      } while (num <=15);
              

        System.out.println("Good bye");

        
        }
    }

    

