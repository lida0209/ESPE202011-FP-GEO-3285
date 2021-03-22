package binarysearch;

import java.util.Scanner;

/**
 *
 * @author Lida Vegay
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] numbersDivisibleBy3 = {3, 12, 18, 69, 33, 60, 321};
        int x;
        int result = 0;

        System.out.println("AUTHOR LIDA VEGAY");
        System.out.println("Searching the numbers divisible by 3 in the array");
        System.out.println("3,12,18,69,33,60,321");
        System.out.println("Please introduce a number");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        result = binarySearch(numbersDivisibleBy3, result, result, x);
        System.out.println("The number is at index: " + result);

    }

    public static int binarySearch(int[] numbersDivisibleBy3, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (numbersDivisibleBy3[mid] == x) {
                return mid;

            } 

                if (numbersDivisibleBy3[mid] > x) {
                    return binarySearch(numbersDivisibleBy3, left, mid - 1, x);
                }else {

                return binarySearch(numbersDivisibleBy3, mid + 1, right, x);
            }
        }
        return -1;
    }
}
