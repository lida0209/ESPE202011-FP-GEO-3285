/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;

/**
 *
 * @author HP
 */
public class ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float addend1;
        float addend2;
        float sum;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println ("===ADDITION===");
        System.out.println("Enter two numbers----");
        addend1 = input.nextFloat();
        addend2 = input.nextFloat();
        
        sum= BasicOperation.addTwoNumbers(addend1, addend2);
        System.out.println(addend1 + "+" + addend2 + "=" + sum);
        
        float operand1;
        float operand2;
        float result;
        
        System.out.println ("===Subtraction===");
        System.out.println("Enter two numbers----");
        operand1 = input.nextFloat();
        operand2 = input.nextFloat();
        
        result= BasicOperation.substractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "-" + operand2 + "=" + result);
        
        float multiplying;
        float multiplier;
        float product;
        
        System.out.println ("===Multiplication===");
        System.out.println("Enter two numbers----");
        multiplying = input.nextFloat();
        multiplier = input.nextFloat();
        
        product= BasicOperation.multiplierTwoNumbers(multiplying, multiplier);
        System.out.println(multiplying + "*" + multiplier + "=" + product);
        
        float dividend;
        float divider;
        float quotient;
        
        System.out.println ("===DIVISION===");
        System.out.println("Enter two numbers----");
        dividend = input.nextFloat();
        divider = input.nextFloat();
        
        quotient= BasicOperation.divideTwoNumbers(dividend, divider);
        System.out.println(dividend + "/" + divider + "=" + quotient);
        
    }
    
}
