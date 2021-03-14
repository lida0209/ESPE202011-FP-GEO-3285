/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixfunctions;

import espe.BasicMatrix;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MatrixFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int a[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int b[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int c[][] = new int[3][3];
        System.out.print("=====AUTOR LIDA VEGAY=====");    
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
        
        System.out.println("The additon of matrix A -> ");
        
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
          c = BasicMatrix.addTwoMatrices(a, b); 
            }
                }
        int d[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int e[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int f[][] = new int[3][3];
           
        for(int i = 0 ; i < 3 ; i++){
        for (int j = 0 ; j < 3 ; j++) {    
            System.out.print("Enter the matrix D  -> ");
                d[i][j] = input.nextInt();        
         }
        }
        for(int i = 0 ; i < 3 ; i++){
        for (int j = 0 ; j < 3 ; j++) {    
            System.out.print("Enter the matrix E  -> ");
                e[i][j] = input.nextInt();
        }
        }
        
        System.out.println("The Subtraction of matrix D -> ");
        
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + d[i][j]);
            }
        }
        
        System.out.println("\nAnd Matrix E -> ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + e[i][j]);
            }        
 }
        System.out.println("\nequals to -> ");
                for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + f[i][j]);
          f = BasicMatrix.subtractTwoMatrices(d, e); 
           }
                }
        int g[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int h[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int k[][] = new int[3][3];
           
        for(int i = 0 ; i < 3 ; i++){
        for (int j = 0 ; j < 3 ; j++) {    
            System.out.print("Enter the matrix G  -> ");
                g[i][j] = input.nextInt();        
         }
        }
        for(int i = 0 ; i < 3 ; i++){
        for (int j = 0 ; j < 3 ; j++) {    
            System.out.print("Enter the matrix H  -> ");
                h[i][j] = input.nextInt();
        }
        }
        
        System.out.println("The Multplication of matrix G -> ");
        
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + g[i][j]);
            }
        }
        
        System.out.println("\nAnd Matrix H -> ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + h[i][j]);
            }        
 }
        System.out.println("\nequals to -> ");
                for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + k[i][j]);
          k = BasicMatrix.multiplyTwoMatrices(g, h); 
                }
        }               
            
      }                
    }


