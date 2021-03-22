package linealsearch;

import java.util.Scanner;

/**
 *
 * @author Lida Vegay
 */
public class LinealSearch {

    public static void main(String[] args) {
        int[] numberDivisibleBy5 = {5, 10, 15, 20, 25, 30, 35, 40};
        int x;
        int result;
        System.out.println("AUTHOR LIDA VEGAY");
        System.out.println("Searching the numbers divisible by 5 in the array");
        System.out.println("5, 10, 15, 20, 25, 30, 35, 40");
        System.out.println("Please introduce a number");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        result = search(numberDivisibleBy5, x);
        System.out.println("The number is at index: " + result);        
    }

    public static int search(int numberDivisibleBy5[], int x) {
        int n = numberDivisibleBy5.length;

        for (int i = 0; i < n; i++) {
            if (numberDivisibleBy5[i] == x) {
                return i;
            }

        }
        return -1;

    }
}
