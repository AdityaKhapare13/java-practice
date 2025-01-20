package RCI;

import java.util.Scanner;

public class smallestLargest {
    public static int Largest(int[] arr) {
        int largest = arr[0]; 
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static int Smallest(int[] arr) {
        int smallest = arr[0]; 
        for (int num : arr) {
            if (num < smallest) { 
                smallest = num;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int a = sc.nextInt();
        int[] array = new int[a]; 
        
        System.out.println("Enter " + a + " numbers:");
        for (int i = 0; i < a; i++) { 
            array[i] = sc.nextInt(); 
        }
        
        System.out.println("Largest number of array is " + Largest(array));
        System.out.println("Smallest number of array is " + Smallest(array));
        
        sc.close(); 
    }
}