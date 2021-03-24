/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author HP
 */
public class BubbleSort {

    public static void sort(int[] integers) {
        //for (int i = 0; i < integers.length - 1; i++) {
        //
        //}
        int n = integers.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    //swap
                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                }
                System.out.print("sorting --> ");
                Sorting.printArray(integers);
            }
            System.out.println("");
        }
    }
    public static int add(int a, int b){
        int c;
        c = a + b;
        a = 0;
        b = 0;
        System.out.println("a (inside add()-> " + a);
        System.out.println("b (inside add()-> " + b);

        return c;
        
    }
    
}
    Scanner input = new Scanner(System.in);
        int [] numbers  = {0,0,0,0,0,0};
        int temp = 0;
        
        for(int i = 0 ; i < 6 ; i++){
            System.out.print("Enter the 6 numbers -> ");
                numbers[i] = input.nextInt();
        }
        

    for (int i = 0; i < numbers.length; i++) {
        for (int j = 1; j < (numbers.length - i); j++) {
            if (numbers[j - 1] > numbers[j]) {
                temp = numbers[j - 1];
                numbers[j - 1] = numbers[j];
                numbers[j] = temp;
            }
        }
    }
    System.out.println(Arrays.toString(numbers));
         }
        
    }
for (int i=1; i < numbers.length; i++) {
         int orderedNumbers = numbers[i];
          int pos = i;
         while ((pos > 0) && (numbers[pos - 1] > orderedNumbers)){
              numbers[pos] = numbers[pos -1];
              pos --;
          }
          numbers[pos]=orderedNumbers;
      }
    
int [] numbers = new int [6];
        for (int i= 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1)+ "Numbers"), 0);
            
        }
        String Array = "Unorder numbers";
        for (int i= 0; i < numbers.length; i++){
            Array = Array + numbers[i] + "   ";
            
        }
        printTheOrdenNumbers(numbers);
         Array = Array + "Unorder numbers";
         for (int i= 0; i < numbers.length; i++){
              Array = Array + "Unorder numbers"+ numbers [i];
              
         }
         JOptionPane.showMessageDialog(null, Array);
         
    }                                       
           public static void printTheOrdenNumbers(int [] numbers){
               for (int i=1; i < numbers.length; i++) {
         int orderedNumbers = numbers[i];
          int pos = i;
         while ((pos > 0) && (numbers[pos - 1] > orderedNumbers)){
              numbers[pos] = numbers[pos -1];
              pos --;
          }
          numbers[pos]=orderedNumbers;
      }