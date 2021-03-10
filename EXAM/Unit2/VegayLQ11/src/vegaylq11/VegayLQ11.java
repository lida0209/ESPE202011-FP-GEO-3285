/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegaylq11;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class VegayLQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
        
        int [] numbers = new int [5];
        int sum = 0;
        
        for (int y = 0; y < 5; y++){
            System.out.println("Enter the number" + y + "->");
            numbers[y] = input.nextInt();
            sum = sum + numbers[y];
        }
        System.out.println("The sum is" + sum);
    
        int i;
        float sum1 = 0;
        float average = 3;
        int [] a = new int [3];

         for (i = 0; i <3; i ++) {
             System.out.println ("enter the integer in position:" + (i + 1));
                                                                                                                          
          a [i] = input.nextInt ();
         }
         for (i = 0; i <a.length; i ++) {
         sum1 = sum1 + a [i];
    
        average = sum1 / a.length;
         }
         System.out.println ("the average is:" + average);
         
         int [] elements = {12,23,34,98,87,65,0};
         int searchNumber = 0;
         
         System.out.println ("Enter number to search");
        
         int elementexists = existsInArray (elements, searchNumber);
         if(elementexists == -1){
             
             
System.out.println("The element does NOT exist in the array");
} else {
System.out.println("The element does Yes exist in the array");

         }
    }
         public static int existsInArray (int elements, float searchNumbers) {
        int elementexists = 0;
        
        
        
            return elementexists;
             
        }     

    private static int existsInArray(int[] elements, int searchNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
    }
    
       
  
        
         
              
    

        
       
        
        
        
       
        
    

