/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examunit1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ExamUnit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
                
            do{
                System.out.println("Multiplication Tables");
                System.out.println("1.--> The Multiplicate tables ");
                System.out.println("0.--> Exit");
                System.out.println("Enter your menu option -->");
           
                option = input.nextInt();
           
                switch (option) {
              
                case 1:
                    int top=12;
                    int product=0; 
                    int table;
                    System.out.println(" Enter the multiplication table > ");
                    table = input.nextInt();
                    for (int l = 1; l <= top ; l++) {
                    product = table * l ;
                    System.out.println(table+ " * " + l + " = " + product);
                    product++;
                            }
                   break;
            
                case 0:
            
                    System.out.println(" Good Bye  ");
                    System.exit(0);
            
                    break;
                    default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                }
        } while (option !=0 );
     
    }
    
}
        
        
        
        
        
        
        
            
          

     

        
    
    

