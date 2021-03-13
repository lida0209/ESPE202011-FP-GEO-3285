/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author HP
 */
public class BasicOperation {
    
    //addition, subtraction, division, multiplication
    public static float addTwoNumbers(float addend1, float addend2){
       float sum = 0;
       
       sum = addend1 + addend2;
       return sum; 
        
    }
     public static float substractTwoNumbers(float minuend, float Subtrahend){
       float subtraction = 0;
       
       subtraction = minuend - Subtrahend;
       return subtraction; 
       }
     public static float multiplierTwoNumbers(float multiplying, float multiplier){
       float product = 0;
       
       product = multiplying * multiplier;
       return product; 
         }
     public static float divideTwoNumbers(float dividend, float divider){
       float quotient = 0;
       
       quotient = dividend / divider;
       return quotient;
        
    }
}
