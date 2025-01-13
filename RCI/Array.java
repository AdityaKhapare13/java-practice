package RCI;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int arr[] = new int [5];
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		int n = 3;
		int k = 3;
		int arr2 [][] = new int [n][k];
		arr2[0][0]=0;
		arr2[0][1]=4;
		arr2[0][2]=5;
		arr2[1][0]=2;
		arr2[1][1]=4;
		arr2[1][2]=50;
		arr2[2][0]=45;
		arr2[2][1]=64;
		arr2[2][2]=47;
		System.out.println();
		
//		System.out.println(Arrays.toString(arr2));
		for(int i = 0;i<n;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(arr2[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
