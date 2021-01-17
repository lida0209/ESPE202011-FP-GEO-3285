/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw0menus;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW0Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do {
            System.out.println(" ========= Temperature Converter =======");
            System.out.println("1. -> C to F");
            System.out.println("2. -> F to C");
            System.out.println("3. -> C to K");
            System.out.println("5. -> Exit");
        System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    float celsius = 0;
                    final float multiplayer;
                    float dividend;
                    final float divider;
                    float addend1;
                    final float addend2;
                    float Farenheit;
                    //INICIALIZATION
                    celsius = 0;
                    multiplayer = 9;
                    dividend = celsius * multiplayer;
                    divider = 5;
                    addend1 =  dividend / divider;                 
                    addend2 = 32;
                    
                    
                    System.out.println("celsius -> ");
                     celsius = input.nextInt();
                    System.out.println("enter multiplayer -> 9 ");
                    dividend = (float) celsius * multiplayer;
                    System.out.println(" the dividend is --> " + dividend);
                    
                    System.out.println("dividend -> " + dividend );
                    System.out.println("divider -> 5 ");
                    addend1 = (float) dividend / divider;
                    System.out.println(" the addend1 is --> " + addend1);
                    
                    System.out.println("enter addend 1 ->  ");
                    
                    System.out.println("enter addend 2 -> 32");
                    
                    Farenheit = (float) (addend1 + addend2);
                    System.out.println(" the Farenheit is --> " + Farenheit);
                    break;
                    
                case 2:
                    float  Farenheit1 = 0;
                    final float subtrahend;
                    float multiplaying;
                    final float multiplier;
                    float dividend1;
                    final float divider1;
                    float Celsius;
                    
                    //inicialization
            
                    Farenheit = 0;
                    subtrahend = 32;
                    multiplaying = Farenheit1 - subtrahend;
                    multiplier = 5;
                    dividend1 = (multiplaying * multiplier);
                    divider1 = 9;
                    
                    
                    System.out.println("enter Farenheit1 -> ");
                     Farenheit1 = input.nextInt();
                    System.out.println("enter subtrahend -> 32 ");
                    multiplaying = (float) Farenheit1 - subtrahend;
                    System.out.println(" the multiplaying is --> " + multiplaying);
                    
                    System.out.println("multiplaying -> " + multiplaying);
                    
                    System.out.println("enter multiplier -> 5 ");
                    dividend1 = (float) multiplaying * multiplier;
                    System.out.println(" the dividend is --> " + dividend1);
                    
                    System.out.println("dividend1 -> " + dividend1 );
                    System.out.println("divider1 -> 9 ");
                    celsius = (float) dividend1 / divider1;
                    System.out.println(" the celsius is --> " + celsius);
                    break;
                case 3:
                    float celsius1;
                    final float addend;
                    float kelvin;
                    
                    celsius1 = 0;
                    addend = 273.15F;
                    kelvin = celsius1 + addend;
                    
                    System.out.println("celsius -> ");
                     celsius1 = input.nextInt();
                    System.out.println("enter addend -> 273.15");
                    kelvin = celsius1 + addend;
                    System.out.println(" the Kelvin is --> " + kelvin);
                    break;
                    
                    
            }
                
            
            
            
            
            
            } while (option != 5);
    }
    
}
    
