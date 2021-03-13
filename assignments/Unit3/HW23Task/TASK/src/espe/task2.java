/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe;

/**
 *
 * @author HP
 */
public class task2 {
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
     public static float maximumheight  (float Voy, float exp, float grav) {
         float hmax = 0.0F;
         
         hmax = (Voy * exp)/ grav *2;
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
