/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13_task;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WS13_Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //circle area
        float radio = 0.0F;
        final float PI = 3.14159F;
        float exponent = 2;
        float área;
        
        área = circlearea(radio,PI,exponent);
        
        System.out.println("The circle area  is");
                    System.out.println("enter radio -> ");
                    radio = input.nextInt();
                    
                     área = PI * (float)Math.pow(radio,exponent);
                    System.out.println(" área --> " + área);
         //trapeze area
         
         float Base = 0.0F;
         float base = 0.0F;
         float height= 0.0F;
         float área1;
         
         área1 = trapezearea(Base, base, height);
          
         System.out.println("The trapeze area  is");
                    System.out.println("enter Base -> ");
                    Base = input.nextInt();
                    
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    
                    System.out.println("enter heignt -> ");
                    height = input.nextInt();
                    
                    área1 = ((Base + base)/2)* height;
                    System.out.println(" área1 --> " + área1);
        // triangle area
        
        float base1 = 0.0F;
        float height1 = 0.0F;
        float área2;     
        
        área2 = trianglearea (base1, height1);
        System.out.println("The triangle area  is");
        System.out.println("enter base1 -> ");
                    base1 = input.nextInt();
                    
                    System.out.println("enter heignt1 -> ");
                    height1 = input.nextInt();
                    
                    área2 = (base1 * height1)/2;
                    
                    System.out.println(" área2 --> " + área2);
       //freefall maximum height
       
       float Voy = 0.0F;
       float exp = 2.0F;
       float grav = 9.8F;
       float hmax;
        hmax = maximumheight (Voy, exp, grav);
        System.out.println("The maximum height  is");
        System.out.println("enter Voy -> ");
                    Voy = input.nextInt(); 
                     
                    hmax = ((float)Math.pow(radio,exponent))/ (grav)*2;
                    System.out.println(" hmax --> " + hmax);
        //speed
        
        float distance = 0.0F;
        float time = 0.0F;
        float speed;
        
        speed = speed1 (distance, time);
        
         System.out.println("The speed  is");
        System.out.println("enter distance -> ");
         distance = input.nextInt(); 
         System.out.println("enter time -> ");
         time = input.nextInt();
         
         speed = distance / time;
         System.out.println(" speed --> " + speed);
         
        //acceleration
        
        float sleep1 = 0.0F;
        float time1 = 0.0F;
        float acceleration;
        
        acceleration = acceleration1 (sleep1, time1);
        
        System.out.println("The acceleration  is");
        System.out.println("enter sleep -> ");
         sleep1 = input.nextInt(); 
         System.out.println("enter time -> ");
         time1 = input.nextInt();
         
         acceleration = sleep1 / time;
         System.out.println(" accelaration --> " + acceleration);        
                 
         
         
    }
     public static float circlearea(float radio, float PI, float exponent ) {
                float área = 0.0F;

                área = (PI)* radio*exponent;

                return área;   
     }
     public static float trapezearea(float Base, float base, float height ) {
                float área1 = 0.0F;

                área1 = (((float)Base + (float) base)/2)* (float) height;

                return área1;   
      }
     public static float trianglearea(float base1, float height1 ) {
                float área2 = 0.0F;

                área2 = ( base1 * height1)/2;

                return área2;      
                
     }
     public static float maximumheight  (float Voy, float exponent, float grav) {
         float hmax = 0.0F;
         
         hmax = (Voy * exponent)/ grav *2;
        return hmax;
        
      }
     public static float speed1  (float distance, float time) {
         float speed = 0.0F;
         
         speed = (float)distance / (float)time;
        return speed;
           
     }
     public static float  acceleration1 (float sleep1, float time1) {
         float acceleration = 0.0F;
         
        acceleration = (float)sleep1 / (float)time1;
        return acceleration;
     
   
    }

}
