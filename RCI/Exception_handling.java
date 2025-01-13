package RCI;

import java.util.Scanner;

public class Exception_handling {

	public static void main(String[] args) {
		int arr[] = new int [5];
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		
		try {
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(arr[4]);
		}
		try {	
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("HI");
		
		Scanner sc = new Scanner(System.in);
		int b = 0;
		try {
			b = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Please enter integer value");
		}finally {
			System.out.println(b);
		}
		

	}

}
