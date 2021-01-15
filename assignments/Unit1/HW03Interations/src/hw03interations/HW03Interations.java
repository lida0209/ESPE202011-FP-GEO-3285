/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03interations;

/**
 *
 * @author HP
 */
public class HW03Interations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i=0;
        
        System.out.println("==== This is a while loop from 1 to 47 ====");

        while (i < 47 ) {
            System.out.println( " i -> " + (i+1));
            //i += 1;
            i++;
            //i = i + 1;
        }
        
        System.out.println("Multiplication Tables : 47 ");
         int top = 12; 
         int product = 0;
         int table = 47;
      
         for(int j = 1 ; j <= top ; j++ ) {
           product = table * j;
             System.out.println( " 47 * " + j + " = " + product);
        }
       
         System.out.println( "VAT calculation  : 0.12");
         float top1 = 12;
         float product1 = 1 ;
         float table1 = 0.12F; 
         
         for(int j = 1 ; j <= top ; j++ ) {
           product = table * j;
             System.out.println( " 0.12 * " + j + " = " + product);
        }
       
         
         
         
        
    }
}
    
    

