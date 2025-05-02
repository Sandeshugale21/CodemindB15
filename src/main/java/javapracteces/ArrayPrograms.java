package javapracteces;

import java.util.Scanner;

public class ArrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {5,10,30,20,2,50,200,100};
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the Size of array :");
				int size = scanner.nextInt();
				
				
				int[]arr = new int[size];
				
				System.out.println("Enter element:");
				for(int i=0;i<size;i++) {
					arr[i]=scanner.nextInt();
				}
				
				System.out.println("Array Elements are :");
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				System.out.println("*************************************************");
				
				for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]>arr[j]) {
							int c =arr[i];
							arr[i]=arr[j];
							arr[j] = c;
						}
					}
				}
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
		System.out.println("*************************************************");
				
				/*for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]<arr[j]) {
							int c =arr[i];
							arr[i]=arr[j];
							arr[j] = c;
						}
					}
				}
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}*/
				
				System.out.println("find min and max in array");
				
				System.out.println("Min :"+arr[0] );
				System.out.println("Max :"+arr[arr.length-1] );
				
				System.out.println("find 3rd min and 2nd max in array");
				
				System.out.println("Min :"+arr[2] );
				System.out.println("Max :"+arr[arr.length-2] );
				
				

			}

	

}
