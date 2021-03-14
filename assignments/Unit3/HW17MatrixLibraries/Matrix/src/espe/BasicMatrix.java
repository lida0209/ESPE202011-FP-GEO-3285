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
public class BasicMatrix {
     public static int[][] addTwoMatrices( int[][] a, int[][] b) {
        int[][] c;
        c = new int [3][3];
        
        for(int i=0; i< 3; i++){
            for (int j=0; j< 3; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
     }
     public static int[][] subtractTwoMatrices( int[][] d, int[][] e) {
        int[][] f;
        f = new int [3][3];
        
        for(int i=0; i< 3; i++){
            for (int j=0; j< 3; j++){
                f[i][j] = d[i][j] - e[i][j];
                  }
        }
        return f;
       }
     public static int[][] multiplyTwoMatrices( int[][] g, int[][] h) {
        int[][] k;
        k = new int [3][3];
        
        for(int i=0; i< 3; i++){
            for (int j=0; j< 3; j++){
                k[i][j] = g[i][j] * h[i][j];         
            }
        }
        return k;
     }
}
