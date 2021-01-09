/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradosc.a.gradosf;

/**
 *
 * @author HP
 */
public class GradosCAGradosF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        
        int celsius;
        int multiplayer;
        
        
        int dividend;
        int divider;
       
        
        int fahrenheit;
        int addend1;       
        int addend2;
        
        //initialization
        
        celsius = 40;
        multiplayer = 9;
        // 40 * 9 = 360
        
        dividend = celsius * multiplayer;
        divider = 5;
        // (celsius * multiplayer) / 5 = 72
        
        addend1 =  dividend / divider;
        addend2 = 32;
        // (dividend / divider) + 32 = 109
        
        //operation
        fahrenheit = addend1 + addend2;
        
         System.out.println("The addition of " + addend1 + " + " + addend2 + 
                "is equal to --> " + fahrenheit);
        
               
        
                
        
        
        
    }
    
}
