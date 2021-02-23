/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15_bidimesionalarrays;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW15_BidimesionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int b[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int c[][] = new int[3][3];
            
        for(int i = 0 ; i < 3 ; i++){
        for (int j = 0 ; j < 3 ; j++) {    
            System.out.print("Enter the matrix A  -> ");
                a[i][j] = input.nextInt();
        }
        }
        for(int i = 0 ; i < 3 ; i++){
        for (int j = 0 ; j < 3 ; j++) {    
            System.out.print("Enter the matrix B  -> ");
                b[i][j] = input.nextInt();
        }
        }
        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
                           
                 
        System.out.println("The substration of matrix A -> ");
        
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + a[i][j]);
            }
        }
        
        System.out.println("\nAnd Matrix B -> ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + b[i][j]);
            }
        }

        System.out.println("\nequals to -> ");
                for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + c[i][j]);
            }
            }
        }
                 
    }
    

