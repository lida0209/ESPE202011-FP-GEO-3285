/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
            
            
        int [] childrenHeights;
        String[] children = {"Mario", "Valentina", "Josue", "Noelia","Evelin"};
        float[] heightsOfChildren = { 105.95F, 112.22F, 117.27F, 122.32F, 110.34F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of  -> ");
        n = input.nextInt();

        childrenHeights = new int[n];
         for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of height of the children " + (i + 1) + " -> ");
            childrenHeights[i] = input.nextInt();
        
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Heights of children " + (i + 1) + " -> " + childrenHeights[i]);
        }

        for (String child : children) {
            System.out.println("children name -> " + child);
        }
        
        for (int i = 0; i < heightsOfChildren.length ; i++) {
            System.out.println("height of children " + (i + 1) + " -> " + heightsOfChildren[i]);
        }
        
        int [] rabbitsBabies;
        String[] rabbits = {"Copo", "Negra", "Brincos","Blanca"};
        float[] weightsByRabbits = { 1.5F, 2.3F, 1.9F, 2.1F, 2.5F };
        
        System.out.println("Enter the name of  -> ");
        n = input.nextInt();  
        
         rabbitsBabies= new int[n];
         for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of rabbits Babies " + (i + 1) + " -> ");
            rabbitsBabies[i] = input.nextInt();
        
        }

        for (int i = 0; i < n; i++) {
            System.out.println("rabbitsBabies " + (i + 1) + " -> " + rabbitsBabies[i]);
        }

        for (String rabbit : rabbits) {
            System.out.println("children name -> " + rabbit);
        }
        
        for (int i = 0; i < weightsByRabbits.length ; i++) {
            System.out.println("weightsByRabbits " + (i + 1) + " -> " + weightsByRabbits[i]);
        }
         int [] teamsGoals;
        String[] teams = {"Liga", "Barcelona", "Emelec","Independiente","Catolica"};
        int [] numberOfPlayers = { 27,32,28,29,32};
        
        System.out.println("Enter the name of  -> ");
        n = input.nextInt();  
        
         teamsGoals= new int[n];
         for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of teams goals in 2020 " + (i + 1) + " -> ");
            rabbitsBabies[i] = input.nextInt();
        
        }

        for (int i = 0; i < n; i++) {
            System.out.println("teamsGoals" + (i + 1) + " -> " + teamsGoals[i]);
        }

        for (String team : teams) {
            System.out.println("children name -> " + team);
        }
        
        for (int i = 0; i < numberOfPlayers.length ; i++) {
            System.out.println("numberOfPlayers " + (i + 1) + " -> " + numberOfPlayers[i]);      
        }           
    }
    

        
}
