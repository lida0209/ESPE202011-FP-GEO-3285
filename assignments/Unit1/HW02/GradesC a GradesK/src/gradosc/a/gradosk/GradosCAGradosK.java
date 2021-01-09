/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradosc.a.gradosk;

/**
 *
 * @author HP
 */
public class GradosCAGradosK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //variables
        
        float celsius;
        float addend;
        float kelvin;
        
        //inicialization
        
        celsius = 35.5F;
        addend = 273.15F;
        kelvin = celsius + addend;
        
        //operation
        
         System.out.println("The addition of " + celsius + " + " + addend + 
                "is equal to --> " + kelvin);
       
    }
    
}
