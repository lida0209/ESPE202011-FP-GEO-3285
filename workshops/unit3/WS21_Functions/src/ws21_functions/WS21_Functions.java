/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21_functions;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WS21_Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
        //life cycle of your printer
        
        int maxCopies = 0;
        int warranty =0;
        float lifeCycle = 0;
        
        System.out.println("==Autor Lida Vegay - PRINTERS==");
        
        lifeCycle = lifeTimeComputer(maxCopies, warranty);
        
        System.out.println("The life time of a computer is");
                    System.out.println("enter maximum number of copies -> ");
                    maxCopies = input.nextInt();
        System.out.println("enter warranty -> ");
                    warranty = input.nextInt();
                     lifeCycle = maxCopies * warranty;
                    System.out.println(" life cycle of your printer --> " + lifeCycle); 
        
                    
        //price per copy.
        
        float printerCost = 0;
        float copiesWithGuarantee = 0;
        float price = 0;
        
        price = pricePerCopy(printerCost,copiesWithGuarantee );
        
        System.out.println("The price per copy is");
                    System.out.println("enter  Printer Cost -> ");
                    printerCost = input.nextInt();
                    System.out.println("enter Copies with guarantee -> ");
                    copiesWithGuarantee = input.nextInt();
                     price = printerCost / copiesWithGuarantee;
                    System.out.println(" PRICE --> " + price);
        
        
                     }
    public static float lifeTimeComputer(int maxCopies ,int warantee ) {
        
                float lifeCycle = 0.0F;
                lifeCycle = (float) maxCopies / (float)warantee ;

                return lifeCycle;
    
    
}
                public static float pricePerCopy(float printerCost ,float copiesWithGuarantee ) {
        
                float price = 0.0F;
                price = (float) printerCost / (float)copiesWithGuarantee ;

                return price;
        
    }
    
}
