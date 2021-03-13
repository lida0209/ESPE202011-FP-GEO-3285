/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskformulas;

import espe.task2;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TaskFormulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
       boolean mainLoop = true;
        int option;
        
        do {
            System.out.println("====AUTOR LIDA VEGAY====");
            System.out.println(" ========= Formulas =======");
            System.out.println("1. -> The circle area");
            System.out.println("2. -> The trapeze area");
            System.out.println("3. -> The triangle area");
            System.out.println("4. -> The freefall maximum height");
            System.out.println("5. -> The speed");
            System.out.println("6. -> The acceleration");
            System.out.println("7. -> Exit");
         System.out.println("Enter your menu option --> ");
            option = input.nextInt();
            
        switch (option) {
        case 1:
        //circle area
        float radio = 0.0F;
        final float PI = 3.14159F;
        float exponent = 2;
        float área;
        
        área = task2.circlearea(radio, PI, exponent);
        System.out.println("The circle area  is");
        System.out.println("enter radio -> ");
        radio = input.nextInt();
        área = PI * (float)Math.pow(radio,exponent);
        System.out.println(" área --> " + área);
         break;
                    
        case 2:
            float Base = 0.0F;
         float base = 0.0F;
         float height= 0.0F;
         float área1;
         
         área1 = task2.trapezearea(base, base, height);
          
         System.out.println("The trapeze area  is");
                    System.out.println("enter Base -> ");
                    Base = input.nextInt();
                    
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    
                    System.out.println("enter heignt -> ");
                    height = input.nextInt();
                    
                    área1 = ((Base + base)/2)* height;
                    System.out.println(" área1 --> " + área1);
         break;
         case 3:            
        // triangle area
        
        float base1 = 0.0F;
        float height1 = 0.0F;
        float área2;     
        
        área2 = task2.trianglearea(base1, height1);
        System.out.println("The triangle area  is");
        System.out.println("enter base1 -> ");
                    base1 = input.nextInt();
                    
                    System.out.println("enter heignt1 -> ");
                    height1 = input.nextInt();
                    
                    área2 = (base1 * height1)/2;
                    
                    System.out.println(" área2 --> " + área2);
         break;
        case 4:            
       //freefall maximum height
       
       float Voy = 0.0F;
       float exp = 2.0F;
       float grav = 9.8F;
       float hmax;
        hmax = task2.maximumheight(Voy, exp, grav);
        System.out.println("The maximum height  is");
        System.out.println("enter Voy -> ");
                    Voy = input.nextInt(); 
                     
                    hmax = ((float)Math.pow(Voy,exp))/ (grav)*2;
                    System.out.println(" hmax --> " + hmax);
         break;
        case 5:            
        //speed
        
        float distance = 0.0F;
        float time = 0.0F;
        float speed;
        
        speed = task2.speed1(distance, time);
        
         System.out.println("The speed  is");
        System.out.println("enter distance -> ");
         distance = input.nextInt(); 
         System.out.println("enter time -> ");
         time = input.nextInt();
         
         speed = distance / time;
         System.out.println(" speed --> " + speed);
          break;
         case 6:
         
        //acceleration
        
        float sleep1 = 0.0F;
        float time1 = 0.0F;
        float acceleration;
        
        acceleration = task2.acceleration1(sleep1, time1);
        
        System.out.println("The acceleration  is");
        System.out.println("enter sleep -> ");
         sleep1 = input.nextInt(); 
         System.out.println("enter time -> ");
         time1 = input.nextInt();
         
         acceleration = sleep1 / time1;
         System.out.println(" accelaration --> " + acceleration);        
        break;
        
            } 
            } while (option != 7);
           
       
    }
    
}
