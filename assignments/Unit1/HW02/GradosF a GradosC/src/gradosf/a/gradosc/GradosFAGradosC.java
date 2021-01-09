/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradosf.a.gradosc;

/**
 *
 * @author HP
 */
public class GradosFAGradosC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //variables
        short Fahrenheit;
        short subtrahend;
       
        
        short multiplaying;
        short multiplier;
      
        
        short dividend;
        short divider;
        short Celsius;
        
        //Iniciatilization
        
        Fahrenheit = 95;
        subtrahend = 32;
        // 95 - 32 = 63
        
        multiplaying = (short) (Fahrenheit - subtrahend); 
        multiplier = 5;
        // (Farenheit - 32) * 5 = 315
        
        dividend = (short) (multiplaying * multiplier);
        divider = 9;
        // (multiplaying * multiplier) / 9 = 35
                
        //Operation
        Celsius = (short) ((short) dividend / divider);
        
        System.out.println("The division of" + dividend + " / " +
                divider + "is equal to --> " + (dividend / divider));
                
                
        
        
        
                
                
    }
    
}
