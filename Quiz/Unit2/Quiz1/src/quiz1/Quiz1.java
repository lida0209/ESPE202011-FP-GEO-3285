/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Student with average grades
        int [] studentAverage;
        String[] students = {"Mario", "Valentina", "Josue", "Noelia","Evelin"};        
        float[] averageGrades = { 14.5F, 16.4F, 13.9F, 15.1F, 14.2F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of students from the average grades -> ");
        n = input.nextInt();
        
         studentAverage = new int[n];
         for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of students from the average grades " + (i + 1) + " -> ");
            studentAverage[i] = input.nextInt();
        
            }

        for (int student :studentAverage ) {
            System.out.println("student Average grades " + student);
        }
        

        for (int i = 0; i < n; i++) {
            System.out.println("Average grades " + (i + 1) + " -> " + studentAverage[i]);
            
        }
 

        for (String student : students) {
            System.out.println("students names -> " + student);
        }
         
        
        for (int i = 0; i < averageGrades.length ; i++) {
            System.out.println("Average of students " + (i + 1) + " -> " + averageGrades[i]);
        }
        int studentAverage1 = 0;
        String[] students1;
        float[] gradesAverages;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of students from the average grades -> ");
        studentAverage1 = scanner.nextInt();
        
        students1 = new String [studentAverage1];
        gradesAverages = new float [studentAverage1];
        
        for (int i=0; i< studentAverage1;i++){
            scanner.nextLine();
            System.out.print("Enter the name of student " +i +"->");
            students1[i] = scanner.nextLine();
            System.out.print("Enter " + students1[i]+ "grades Averages ->");
            gradesAverages[i] = scanner.nextFloat();
        }
        
        System.out.println("Student -> \t average grades ");
        for (int i=0; i<studentAverage1; i++ ) {
            System.out.println(students1[i]+ "-> \t" + gradesAverages[i] );
        }
    }
    
}
