/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseoperations;

/**
 *
 * @author HP
 */
public class BaseOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables declaration
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int multiplying;
        int multiplier;
        int product;
        
        int dividend;
        int divider;
        int quotient;
        
        int dividend1;
        int divider1;
        int rest;
                
       
       
        //initialization
        addend1 = 5;
        addend2 = 18;
        
        minuend = -23;
        subtrahend = -6;
        //-23 - (-6) = -23 + 6 = -17
        
        multiplying = 32;
        multiplier  = 18;
        // 32 * 18 = 576
        
        dividend = 164;
        divider = 4;
        // 164 / 4 = 41
        
        dividend1 = 12;
        divider1 =  5;
        rest = dividend1 % divider1;    
        // 12 % 5 = 2 
       
        
        //operation
        sum = addend1 + addend2;
        
        System.out.println("The addition of " + addend1 + " + " + addend2 + 
                "is equal to --> " + sum);
        
        
        ++sum;
        System.out.println("sum is equal to -->" + sum);
        
        sum++;
        System.out.println("sum is equal to -->" + sum);
        
        System.out.println("adding one to sum" + (sum++));
        
        System.out.println("adding one to sum" + ((++sum)));
        
        System.out.println("The subtraction of" + minuend + " - " + subtrahend + 
                "is equal to --> " + (minuend - subtrahend));
        
        System.out.println("The multiplication of" + multiplying + " * " +
                multiplier + "is equal to --> " + (multiplying * multiplier));
                
        System.out.println("The division of" + dividend + " / " +
                divider + "is equal to --> " + (dividend / divider));
                
        System.out.println("The module of" + dividend1 + " % " + divider1
                 + "is equal to --> " + (dividend1 % divider1));
        
            
  
   
        
       
    }
    
}
