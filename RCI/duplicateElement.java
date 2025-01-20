package RCI;

import java.util.Scanner;

public class duplicateElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter "+a+" numbers :");
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();		
		}
		
		System.out.println("Duplicate numbers");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				if(arr[i] == arr[j] && i != j) {
					System.out.println(arr[j]);
					sc.close(); 
				}
			}
		}

	}
	

}
