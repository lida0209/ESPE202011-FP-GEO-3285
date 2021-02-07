/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11functions_recursion;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author HP
 */
public class HW11Functions_Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);  
      //population percentage
      int Currentvariable = 0;
      int Oldvariable = 0;
      final int valor = 100;
      float y = 0; 
      
      y= populationPercentage (Currentvariable,Oldvariable, valor );
      
        
       //functions
       System.out.println("The percentage is");
                    System.out.println("enter Currentvariable -> ");
                    Currentvariable = input.nextInt();
                    System.out.println("enter Oldvariable -> ");
                    Oldvariable = input.nextInt();
                    y = ((Currentvariable - Oldvariable )/ Oldvariable)* valor;
       
        y = populationPercentage(Currentvariable,Oldvariable, valor);
        System.out.println(" percentage of" + y + "is equal to ->" + y);
        
        
        int number = 4;
        int fact = 0;
        fact = factorial(number);
        System.out.println("factorial of " + number + " is equal to -> " + fact);
        
        
    }   
        public static float populationPercentage(int Currentvariable, int Oldvariable, int valor) {
         
        float y = 0.0F;

        y = (((float)Currentvariable - (float) Oldvariable)/ (float) Oldvariable) * valor;

        return y;
        }
        public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
        }
     
      
    }
    
}
